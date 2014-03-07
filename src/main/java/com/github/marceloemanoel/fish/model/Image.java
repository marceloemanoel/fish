package com.github.marceloemanoel.fish.model;

import com.google.common.base.Objects;

public class Image {
    private Long id;
    private String name;
    private String slug;
    private String distribution;
    private Boolean publicImage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public Boolean isPublicImage() {
        return publicImage;
    }

    public void setPublicImage(Boolean publicImage) {
        this.publicImage = publicImage;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id,
                                name,
                                slug,
                                distribution,
                                publicImage);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !obj.getClass().isAssignableFrom(getClass())){
            return false;
        }

        Image other = (Image)obj;
        return Objects.equal(id, other.getId())
            && Objects.equal(name, other.getName())
            && Objects.equal(slug, other.getSlug())
            && Objects.equal(distribution, other.getDistribution())
            && Objects.equal(publicImage, other.isPublicImage());
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add("id", id)
                      .add("name", name)
                      .add("slug", slug)
                      .add("distribution", distribution)
                      .add("public", publicImage)
                      .toString();
    }
}
