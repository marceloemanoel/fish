package com.github.marceloemanoel.fish.model.messages;

import com.github.marceloemanoel.fish.model.Droplet;

import java.util.List;

public class ListDropletsMessage extends DigitalOceanMessage {

    private List<Droplet> droplets;

    public List<Droplet> getDroplets() {
        return droplets;
    }

    public void setDroplets(List<Droplet> droplets) {
        this.droplets = droplets;
    }

}
