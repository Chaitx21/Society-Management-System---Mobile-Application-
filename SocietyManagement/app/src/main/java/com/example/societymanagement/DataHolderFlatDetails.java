package com.example.societymanagement;

public class DataHolderFlatDetails {
    String FlatArea,FlatType,FlatFloor,EmailId;

    public DataHolderFlatDetails(String flatArea, String flatType, String flatFloor, String emailId) {
        this.FlatArea = flatArea;
        this.FlatType = flatType;
        this.FlatFloor = flatFloor;
        this.EmailId = emailId;
    }

    public String getFlatArea() {
        return FlatArea;
    }

    public void setFlatArea(String flatArea) {
        this.FlatArea = flatArea;
    }

    public String getFlatType() {
        return FlatType;
    }

    public void setFlatType(String flatType) {
        this.FlatType = flatType;
    }

    public String getFlatFloor() {
        return FlatFloor;
    }

    public void setFlatFloor(String flatFloor) {
        this.FlatFloor = flatFloor;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        this.EmailId = emailId;
    }
}
