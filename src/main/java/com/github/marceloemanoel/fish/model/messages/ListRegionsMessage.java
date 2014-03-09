package com.github.marceloemanoel.fish.model.messages;

import com.github.marceloemanoel.fish.model.Region;

import java.util.List;

public class ListRegionsMessage extends DigitalOceanMessage {

    private List<Region> regions;

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}
