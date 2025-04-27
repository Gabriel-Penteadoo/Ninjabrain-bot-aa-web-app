package com.example.sseclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllAdvancementsResponse {

    private PositionDto spawn;
    private PositionDto stronghold;
    private PositionDto monument;
    private PositionDto cityQuery;
    private PositionDto shulkerTransport;
    private PositionDto generalLocation;
    private PositionDto deepDark;
    private PositionDto outpost;

    @JsonProperty("isAllAdvancementsModeEnabled")
    private boolean allAdvancementsModeEnabled;

    // Getters and Setters

    public PositionDto getSpawn() {
        return spawn;
    }

    public void setSpawn(PositionDto spawn) {
        this.spawn = spawn;
    }

    public PositionDto getStronghold() {
        return stronghold;
    }

    public void setStronghold(PositionDto stronghold) {
        this.stronghold = stronghold;
    }

    public PositionDto getMonument() {
        return monument;
    }

    public void setMonument(PositionDto monument) {
        this.monument = monument;
    }

    public PositionDto getCityQuery() {
        return cityQuery;
    }

    public void setCityQuery(PositionDto cityQuery) {
        this.cityQuery = cityQuery;
    }

    public PositionDto getShulkerTransport() {
        return shulkerTransport;
    }

    public void setShulkerTransport(PositionDto shulkerTransport) {
        this.shulkerTransport = shulkerTransport;
    }

    public PositionDto getGeneralLocation() {
        return generalLocation;
    }

    public void setGeneralLocation(PositionDto generalLocation) {
        this.generalLocation = generalLocation;
    }

    public PositionDto getDeepDark() {
        return deepDark;
    }

    public void setDeepDark(PositionDto deepDark) {
        this.deepDark = deepDark;
    }

    public PositionDto getOutpost() {
        return outpost;
    }

    public void setOutpost(PositionDto outpost) {
        this.outpost = outpost;
    }

    public boolean isAllAdvancementsModeEnabled() {
        return allAdvancementsModeEnabled;
    }

    public void setAllAdvancementsModeEnabled(boolean allAdvancementsModeEnabled) {
        this.allAdvancementsModeEnabled = allAdvancementsModeEnabled;
    }

    @Override
    public String toString() {
        return "AllAdvancementsResponse{" +
                "spawn=" + spawn +
                ", stronghold=" + stronghold +
                ", monument=" + monument +
                ", cityQuery=" + cityQuery +
                ", shulkerTransport=" + shulkerTransport +
                ", generalLocation=" + generalLocation +
                ", deepDark=" + deepDark +
                ", outpost=" + outpost +
                ", allAdvancementsModeEnabled=" + allAdvancementsModeEnabled +
                '}';
    }
}
