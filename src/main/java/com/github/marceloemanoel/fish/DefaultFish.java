package com.github.marceloemanoel.fish;

import com.github.marceloemanoel.fish.model.*;
import com.github.marceloemanoel.fish.model.messages.*;

import com.google.common.base.Optional;
import com.google.gson.Gson;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.fluent.Content;
import static org.apache.http.client.fluent.Request.*;
import static com.google.common.base.Optional.*;

import java.io.IOException;
import java.util.List;

public class DefaultFish implements Fish {

    private Gson gson;

    public DefaultFish(Gson gson) {
        this.gson = gson;
    }

    @Override
    public List<Image> allImages(Credentials credentials, Optional<ImageFilter> filter) {
        try{
            String uri = String.format("https://api.digitalocean.com/images/?client_id=%s&api_key=%s", credentials.clientId(), credentials.apiKey());
            Content content = Get(uri).execute().returnContent();
            ListImagesMessage listImagesMessage = gson.fromJson(content.asString(), ListImagesMessage.class);
            System.out.println(content.asString());
            System.out.println(listImagesMessage.getStatus());
            return listImagesMessage.getImages();
        }
        catch (ClientProtocolException e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Image showImage(Credentials credentials, Long imageId) {
        try{
            String uri = String.format("https://api.digitalocean.com/images/%s/?client_id=%s&api_key=%s", imageId, credentials.clientId(), credentials.apiKey());
            Content content = Get(uri).execute().returnContent();
            ShowImageMessage message = gson.fromJson(content.asString(), ShowImageMessage.class);
            System.out.println(content.asString());
            System.out.println(message.getStatus());
            return message.getImage();
        }
        catch (ClientProtocolException e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void destroyImage(Credentials credentials, Long imageId) {
        try{
            String uri = String.format("https://api.digitalocean.com/images/%s/destroy/?client_id=%s&api_key=%s", imageId, credentials.clientId(), credentials.apiKey());
            Content content = Get(uri).execute().returnContent();
            DigitalOceanMessage message = gson.fromJson(content.asString(), DigitalOceanMessage.class);
            System.out.println(content.asString());
            System.out.println(message.getStatus());
        }
        catch (ClientProtocolException e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Region> allRegions(Credentials credentials) {
        try{
            String uri = String.format("https://api.digitalocean.com/regions/?client_id=%s&api_key=%s", credentials.clientId(), credentials.apiKey());
            Content content = Get(uri).execute().returnContent();
            ListRegionsMessage listRegionsMessage = gson.fromJson(content.asString(), ListRegionsMessage.class);
            return listRegionsMessage.getRegions();
        }
        catch (ClientProtocolException e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Size> allSizes(Credentials credentials) {
        try{
            String uri = String.format("https://api.digitalocean.com/sizes/?client_id=%s&api_key=%s", credentials.clientId(), credentials.apiKey());
            Content content = Get(uri).execute().returnContent();
            ListSizesMessage message = gson.fromJson(content.asString(), ListSizesMessage.class);
            return message.getSizes();
        }
        catch (ClientProtocolException e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
        return createDroplet(credentials,
                             name,
                             size,
                             image,
                             region,
                             Optional.<String>absent(),
                             Optional.<Boolean>absent(),
                             Optional.<Boolean>absent());
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
