package com.company;

public class Main {

    public static void main(String[] args) {

        HouseLocation houseLocation = new HouseLocation("Moskovskaya", 32);

        Father father = new Father(39,"Akyn",houseLocation, Hobby.GOLF, " Construction company");
        Son son1 = new Son(17,"Bektur",houseLocation, Hobby.BASKETBALL,"School 37 grade 11A",2);
        Son son2 = new Son(10,"Adil",houseLocation, Hobby.FOOTBALL, "School 37 grade 5B", 4);

        System.out.println(father.printInfo());
        father.occupationType();
        father.weekendActivity();
        System.out.println("----------------");
        System.out.println(son1.printInfo());
        son1.occupatinType();
        System.out.println("----------------");
        System.out.println(son2.printInfo());
        son2.occupatinType();
    }
}
