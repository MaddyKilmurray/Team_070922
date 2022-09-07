package com.sparta;

public abstract class Spartan {
    private String spartanName;
    private String spartanAddress;
    private String spartanContactNumber;
    private double spartanPay;

    public Spartan(String name, String address, String number, double pay) {
        spartanName = name;
        spartanAddress = address;
        spartanContactNumber = number;
        spartanPay = pay;
    }

    public String getSpartanName() {
        return spartanName;
    }

    public void setSpartanName(String spartanName) {
        this.spartanName = spartanName;
    }

    public String getSpartanAddress() {
        return spartanAddress;
    }

    public void setSpartanAddress(String spartanAddress) {
        this.spartanAddress = spartanAddress;
    }

    public String getSpartanContactNumber() {
        return spartanContactNumber;
    }

    public void setSpartanContactNumber(String spartanContactNumber) {
        this.spartanContactNumber = spartanContactNumber;
    }

    public double getPay() {
        return spartanPay;
    }

    public void setPay(double pay) {
        spartanPay = pay;
    }
}
