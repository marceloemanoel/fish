package com.github.marceloemanoel.fish;

import com.github.marceloemanoel.fish.model.Droplet;
import com.github.marceloemanoel.fish.model.Image;
import com.github.marceloemanoel.fish.model.Region;
import com.github.marceloemanoel.fish.model.Size;
import com.google.common.base.Optional;

import java.util.List;

public interface Fish {

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
