package com.github.marceloemanoel.fish.model;

import com.google.common.base.Objects;

public class Size {

    private Long id;
    private String name;
    private String slug;

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

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, slug);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !obj.getClass().isAssignableFrom(getClass())) {
            return false;
        }
        Size other = (Size) obj;

        return Objects.equal(id, other.getId())
            && Objects.equal(name, other.getName())
            && Objects.equal(slug, other.getSlug());
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add("id", id)
                      .add("name", name)
                      .add("slug", slug)
                      .toString();
    }
}
