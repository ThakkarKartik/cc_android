package com.example.cc_android;

public class user {
    public user(String name, String desc, int image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    String name;
    String desc;
    int image;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
