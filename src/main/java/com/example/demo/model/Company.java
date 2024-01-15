package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String address;
    private String phone;
    private String cvr;
    private List<Owner> owners;
    private double profitability;

    public Company(String address, String phone, String cvr, double profitability) {
        this.address = address;
        this.phone = phone;
        this.cvr = cvr;
        owners = new ArrayList<>();
        this.profitability = profitability;
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public double getProfitability() {
        return profitability;
    }

    public void setProfitability(int profitability) {
        this.profitability = profitability;
    }

}
