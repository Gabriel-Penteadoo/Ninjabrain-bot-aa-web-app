package com.example.sseclient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PositionDto {

    @JsonProperty("overworldDistance")
    private Double overworldDistance;

    @JsonProperty("xInOverworld")
    private Double xInOverworld;

    @JsonProperty("zInOverworld")
    private Double zInOverworld;

    @JsonProperty("travelAngle")
    private Double travelAngle;

    // Getters and Setters

    public Double getOverworldDistance() {
        return overworldDistance;
    }

    public void setOverworldDistance(Double overworldDistance) {
        this.overworldDistance = overworldDistance;
    }

    public Double getXInOverworld() {
        return xInOverworld;
    }

    public void setXInOverworld(Double xInOverworld) {
        this.xInOverworld = xInOverworld;
    }

    public Double getZInOverworld() {
        return zInOverworld;
    }

    public void setZInOverworld(Double zInOverworld) {
        this.zInOverworld = zInOverworld;
    }

    public Double getTravelAngle() {
        return travelAngle;
    }

    public void setTravelAngle(Double travelAngle) {
        this.travelAngle = travelAngle;
    }

    @Override
    public String toString() {
        return "PositionDto{" +
                "overworldDistance=" + overworldDistance +
                ", xInOverworld=" + xInOverworld +
                ", zInOverworld=" + zInOverworld +
                ", travelAngle=" + travelAngle +
                '}';
    }
}
