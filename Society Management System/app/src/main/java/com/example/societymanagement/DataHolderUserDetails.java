package com.example.societymanagement;

public class DataHolderUserDetails {
    String Name,MobileNo,DOB,Address;

    public DataHolderUserDetails(String name, String mobileNo, String DOB, String address) {
        this.Name = name;
        this.MobileNo = mobileNo;
        this.DOB = DOB;
        this.Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.MobileNo = mobileNo;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }
}
