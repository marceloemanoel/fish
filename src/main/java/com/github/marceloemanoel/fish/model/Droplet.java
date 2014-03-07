package com.github.marceloemanoel.fish.model;

import java.util.Date;
import com.google.common.base.Objects;

public class Droplet {
    private Long id;
    private String name;
    private Long imageId;
    private Long sizeId;
    private Long regionId;
    private Boolean backupsActive;
    private String ipAddress;
    private String privateIpAddress;
    private Boolean locked;
    private String status;
    private Date createdAt;

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

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Long getSizeId() {
        return sizeId;
    }

    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Boolean areBackupsActive() {
        return backupsActive;
    }

    public void setBackupsActive(Boolean backupsActive) {
        this.backupsActive = backupsActive;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public Boolean isLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id,
                                name,
                                imageId,
                                sizeId,
                                regionId,
                                backupsActive,
                                ipAddress,
                                privateIpAddress,
                                locked,
                                status,
                                createdAt);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !obj.getClass().isAssignableFrom(getClass())){
            return false;
        }
        Droplet other = (Droplet)obj;
        return Objects.equal(id, other.getId())
            && Objects.equal(name, other.getName())
            && Objects.equal(imageId, other.getImageId())
            && Objects.equal(sizeId, other.getSizeId())
            && Objects.equal(regionId, other.getRegionId())
            && Objects.equal(backupsActive, other.areBackupsActive())
            && Objects.equal(ipAddress, other.getIpAddress())
            && Objects.equal(privateIpAddress, other.getPrivateIpAddress())
            && Objects.equal(locked, other.isLocked())
            && Objects.equal(status, other.getStatus())
            && Objects.equal(createdAt, other.getCreatedAt());
    }

    public String toString() {
        return Objects.toStringHelper(this)
                      .add("id", id)
                      .add("name", name)
                      .add("image_id", imageId)
                      .add("size_id", sizeId)
                      .add("region_id", regionId)
                      .add("backups_active", backupsActive)
                      .add("id_address", ipAddress)
                      .add("private_ip_address", privateIpAddress)
                      .add("locked", locked)
                      .add("status", status)
                      .add("created_at", createdAt)
                      .toString();
    }
}
