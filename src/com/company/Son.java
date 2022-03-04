package com.company;

public final class Son extends Father {

    private int bestFriend;

    public int getBestFriend() {
        return bestFriend;
    }

    public Son(int age, String name, HouseLocation houseLocation, Hobby hobby, String occupation, int bestFriend) {
        super(age, name, houseLocation, hobby, occupation);
        this.bestFriend = bestFriend;
    }

    public void occupatinType() {
        System.out.println(this.getName() + " study in  " + this.getOccupation());
    }

    public String printInfo(){
        return super.printInfo() +
               "\n" + this.getName() + " have "  + this.getBestFriend() + " best friends";
    }
}
