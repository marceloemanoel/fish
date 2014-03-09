package com.github.marceloemanoel.fish.model.messages;

import com.github.marceloemanoel.fish.model.Image;

import java.util.List;

public class ListImagesMessage extends DigitalOceanMessage {

    private List<Image> images;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
