package com.github.marceloemanoel.fish.model.messages;

import com.github.marceloemanoel.fish.model.Droplet;

import java.util.List;

public class ListDropletsMessage {

    private String status;
    private List<Droplet> droplets;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Droplet> getDroplets() {
        return droplets;
    }

    public void setDroplets(List<Droplet> droplets) {
        this.droplets = droplets;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
