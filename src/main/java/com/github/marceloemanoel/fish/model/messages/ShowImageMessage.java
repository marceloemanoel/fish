package com.github.marceloemanoel.fish.model.messages;

import com.github.marceloemanoel.fish.model.Image;

public class ShowImageMessage extends DigitalOceanMessage {

    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
