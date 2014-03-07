package com.github.marceloemanoel.fish;

import com.github.marceloemanoel.fish.model.Droplet;
import com.github.marceloemanoel.fish.model.Image;
import com.github.marceloemanoel.fish.model.Region;
import com.github.marceloemanoel.fish.model.Size;
import com.github.marceloemanoel.fish.model.messages.ListDropletsMessage;

import com.google.common.base.Optional;
import com.google.gson.Gson;
import org.apache.http.client.fluent.Content;
import static org.apache.http.client.fluent.Request.*;
import static com.google.common.base.Optional.*;

import java.util.List;

public class DefaultFish implements Fish {

    private Gson gson;

    public DefaultFish(Gson gson) {
        this.gson = gson;
    }

    @Override
    public List<Droplet> activeDroplets(Credentials credentials) {
        try {
            String uri = String.format("https://api.digitalocean.com/droplets/?client_id=%s&api_key=%s", credentials.clientId(), credentials.apiKey());
            Content response = Get(uri).execute().returnContent();
            ListDropletsMessage listDropletsMessage = gson.fromJson(response.asString(), ListDropletsMessage.class);
            return listDropletsMessage.getDroplets();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Droplet createDroplet(Credentials credentials, String name, Size size, Image image, Region region) {
        return createDroplet(credentials, name, size, image, region, absent(), absent(), absent());
    }

    @Override
    public Droplet createDroplet(Credentials credentials,
                                 String name,
                                 Size size,
                                 Image image,
                                 Region region,
                                 Optional<String> sshKeysId,
                                 Optional<Boolean> privateNetworking,
                                 Optional<Boolean> backupsEnabled) {
        return null;
    }


}
