package com.immutable;

public class Address {

    @Override
    public String toString() {
        return "Address{" +
            "houseNo=" + houseNo +
            ", street='" + street + '\'' +
            '}';
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private int houseNo;
    private String street;
}
