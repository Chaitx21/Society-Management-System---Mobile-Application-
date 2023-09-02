package com.example.societymanagement;

public class DataHolderBillDetails {
    String Waterbill,Parkingbill,Eventfund,Servicecharge,Total,Paid,Balance;

    public DataHolderBillDetails(String waterbill, String parkingbill, String eventfund, String servicecharge, String total, String paid, String balance) {
        this.Waterbill = waterbill;
        this.Parkingbill = parkingbill;
        this.Eventfund = eventfund;
        this.Servicecharge = servicecharge;
        this.Total = total;
        this.Paid = paid;
        this.Balance = balance;
    }

    public String getWaterbill() {
        return Waterbill;
    }

    public void setWaterbill(String waterbill) {
        this.Waterbill = waterbill;
    }

    public String getParkingbill() {
        return Parkingbill;
    }

    public void setParkingbill(String parkingbill) {
        this.Parkingbill = parkingbill;
    }

    public String getEventfund() {
        return Eventfund;
    }

    public void setEventfund(String eventfund) {
        this.Eventfund = eventfund;
    }

    public String getServicecharge() {
        return Servicecharge;
    }

    public void setServicecharge(String servicecharge) {
        this.Servicecharge = servicecharge;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        this.Total = total;
    }

    public String getPaid() {
        return Paid;
    }

    public void setPaid(String paid) {
        this.Paid = paid;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        this.Balance = balance;
    }
}
