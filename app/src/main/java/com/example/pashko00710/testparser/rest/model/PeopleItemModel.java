package com.example.pashko00710.testparser.rest.model;import com.google.gson.annotations.SerializedName;public class PeopleItemModel {    @SerializedName("id")    private String id;    @SerializedName("name")    private String name;    @SerializedName("surname")    private String surName;    @SerializedName("info")    private String info;    @SerializedName("created_at")    private String createdItem;    public String getLink() {        return id;    }    public void setLink(String id) {        this.id = id;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getSurName() {        return surName;    }    public void setSurName(String surName) {        this.surName = surName;    }    public String getInfo() {        return info;    }    public void setInfo(String info) {        this.info = info;    }    public String getCreatedItem() {        return createdItem;    }    public void setCreatedItem(String createdItem) {        this.createdItem = createdItem;    }}