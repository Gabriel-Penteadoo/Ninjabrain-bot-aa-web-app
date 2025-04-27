package com.example.sseclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SseClientApplication implements CommandLineRunner {

	@Autowired
	private AdvancementDataStore dataStore;

	public static void main(String[] args) {
		SpringApplication.run(SseClientApplication.class, args);
	}

	@Override
	public void run(String... args) {
		WebClient client = WebClient.builder()
				.baseUrl("http://localhost:52533")
				.build();

		Flux<AllAdvancementsResponse> eventStream = client.get()
				.uri("/api/v1/all-advancements/events")
				.retrieve()
				.bodyToFlux(AllAdvancementsResponse.class);

		eventStream.subscribe(
				response -> {
					System.out.println("Received mapped object:");
					System.out.println(response);
					dataStore.setLatestResponse(response);
				},
				error -> {
					System.err.println("Error occurred:");
					error.printStackTrace();
				},
				() -> System.out.println("Stream ended.")
		);

		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
