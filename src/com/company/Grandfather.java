package com.company;

public class Grandfather {
    private int age;
    private String name;
    private HouseLocation houseLocation;
    private Hobby hobby;

    public Grandfather(int age,String name,HouseLocation houseLocation, Hobby hobby) {
        this.age = age;
        this.name = name;
        this.houseLocation = houseLocation;
    this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public Hobby getHobby() {
        return hobby;
    }

    public String printInfo (){
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nHouse Location: " + houseLocation.getStreetName() + " " + houseLocation.getHouseNumber() +
                "\nHobby: " + hobby;
    }
}
