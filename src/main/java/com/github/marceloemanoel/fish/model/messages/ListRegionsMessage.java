package com.github.marceloemanoel.fish.model.messages;

import com.github.marceloemanoel.fish.model.Region;

import java.util.List;

public class ListRegionsMessage {
    private String status;
    private List<Region> regions;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
