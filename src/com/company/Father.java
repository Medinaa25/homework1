package com.company;

public class Father extends Grandfather{
    private String occupation;

    public Father(int age, String name, HouseLocation houseLocation, Hobby hobby, String occupation) {
        super(age, name, houseLocation, hobby);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public  void occupationType (){
        System.out.println(this.getName() + " work in " + this.occupation);
    }
    public final void weekendActivity(){
        System.out.println(this.getName() + " plays " + Hobby.GOLF + " on the weekends");
    }
    public String printInfo (){
        return super.printInfo() +
                "\n His occupation: " + getOccupation();
    }
}

