package com.cskaoyan.bean;

import java.sql.Date;

public class Custom {



    private String customParams;
    private String customId;

    private String customName;

    private String fullName;

    private String address;

    private String fax;

    private String email;

    private String ownerName;

    private String ownerTel;

    private Integer status;

    private String note;

    public String getCustomParams() {
        return customParams;
    }

    public void setCustomParams(String customParams) {
        this.customParams = customParams;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel == null ? null : ownerTel.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Custom() {
    }

    public Custom(String customParams, String customId, String customName, String fullName, String address, String fax, String email, String ownerName, String ownerTel, Integer status, String note) {
        this.customParams = customParams;
        this.customId = customId;
        this.customName = customName;
        this.fullName = fullName;
        this.address = address;
        this.fax = fax;
        this.email = email;
        this.ownerName = ownerName;
        this.ownerTel = ownerTel;
        this.status = status;
        this.note = note;
    }
    @Override
    public String toString() {
        return "Custom{" +
                "customParams='" + customParams + '\'' +
                ", customId='" + customId + '\'' +
                ", customName='" + customName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", ownerTel='" + ownerTel + '\'' +
                ", status=" + status +
                ", note='" + note + '\'' +
                '}';
    }


}


