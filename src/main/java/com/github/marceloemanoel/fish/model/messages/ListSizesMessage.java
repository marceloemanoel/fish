package com.github.marceloemanoel.fish.model.messages;

import com.github.marceloemanoel.fish.model.Size;

import java.util.List;

public class ListSizesMessage extends DigitalOceanMessage {

    private List<Size> sizes;

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
}
