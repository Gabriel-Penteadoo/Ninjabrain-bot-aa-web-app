package com.example.sseclient;

import org.springframework.stereotype.Component;

@Component
public class AdvancementDataStore {
    private volatile AllAdvancementsResponse latestResponse;

    public AllAdvancementsResponse getLatestResponse() {
        return latestResponse;
    }

    public void setLatestResponse(AllAdvancementsResponse latestResponse) {
        this.latestResponse = latestResponse;
    }
}
