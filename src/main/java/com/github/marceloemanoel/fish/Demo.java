package com.github.marceloemanoel.fish;

import com.github.marceloemanoel.fish.model.Image;
import com.github.marceloemanoel.fish.model.ImageFilter;
import com.google.common.base.Optional;
import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Credentials credentials = getCredentials();

        Fish fish = new DefaultFish(gson);
        List<Image> images = fish.allImages(credentials, Optional.<ImageFilter>absent());
        Image image = fish.showImage(credentials, images.get(0).getId());
        System.out.println(images);
        System.out.println(image);
        System.out.println(fish.allRegions(credentials));
        System.out.println(fish.allSizes(credentials));
    }

    private static Credentials getCredentials() throws IOException {
        File fishConfigHome = new File(System.getProperty("user.home"), ".fish");
        File fishConfigFile = new File(fishConfigHome, "credentials.properties");

        URL credentialsURL = fishConfigFile.exists() ? fishConfigFile.toURL()
                                                     : Demo.class.getResource("/credentials.properties");

        return PropertyCredentials.loadFrom(credentialsURL);
    }

}
