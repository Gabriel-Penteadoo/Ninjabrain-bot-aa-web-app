package com.example.sseclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Add @RestController so that all methods automatically return JSON
@RestController
@RequestMapping("/api")
public class AdvancementController {

    private final AdvancementDataStore AdvancementdataStore;

    public AdvancementController(AdvancementDataStore AdvancementdataStore) {
        this.AdvancementdataStore = AdvancementdataStore;
    }

    @GetMapping("/latest")
    public AllAdvancementsResponse getLatest() {
        return AdvancementdataStore.getLatestResponse();
    }
}
