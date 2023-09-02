package com.example.societymanagement;

public class uploadinfo {

    public String imageName;
    public String imageURL;
    public uploadinfo(){}

    public uploadinfo(String name, String url) {
        this.imageName = name;
        this.imageURL = url;
    }

    public String getImageName() {
        return imageName;
    }
    public String getImageURL() {
        return imageURL;
    }
}
