package com.github.marceloemanoel.fish;

import com.github.marceloemanoel.fish.model.*;
import com.google.common.base.Optional;

import java.util.List;

public interface Fish {

    public List<Image> allImages(Credentials credentials, Optional<ImageFilter> filter);

    public Image showImage(Credentials credentials, Long imageId);

    public void destroyImage(Credentials credentials, Long imageId);

    public String transferImage(Credentials credentials, Long imageId, Long regionId);

    public List<Region> allRegions(Credentials credentials);

    public List<Size> allSizes(Credentials credentials);

    public List<Droplet> activeDroplets(Credentials credentials);

    public Droplet createDroplet(Credentials credentials,
                                 String name,
                                 Size size,
                                 Image image,
                                 Region region);

    public Droplet createDroplet(Credentials credentials,
                                 String name,
                                 Size size,
                                 Image image,
                                 Region region,
                                 Optional<String> sshKeysId,
                                 Optional<Boolean> privateNetworking,
                                 Optional<Boolean> backupsEnabled);
}
