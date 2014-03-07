package com.github.marceloemanoel.fish;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Demo {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Credentials credentials = getCredentials();

        Fish fish = new DefaultFish(gson);
        System.out.println(fish.activeDroplets(credentials));
    }

    private static Credentials getCredentials() throws IOException {
        File fishConfigHome = new File(System.getenv("user.home"), ".fish");
        File fishConfigFile = new File(fishConfigHome, "credentials.properties");

        URL credentialsURL = fishConfigFile.exists() ? fishConfigFile.toURL()
                                                     : Demo.class.getResource("/credentials.properties");

        return PropertyCredentials.loadFrom(credentialsURL);
    }

}
