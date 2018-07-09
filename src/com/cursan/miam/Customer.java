package com.cursan.miam;

public class Customer {
    String fullname;
    String address;

    public Customer(){
        fullname = "Nobody";
        address = "Nowhere";
    }

    public Customer(String fullname, String address){
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }
}
