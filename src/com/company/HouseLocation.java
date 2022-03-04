package com.company;

public class HouseLocation {
    private int houseNumber;
    private String streetName;

    public HouseLocation( String streetName, int houseNumber) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }
}
