package com.mysite;

public class Mainclass1 {

    public static void main(String[] args){
        Phone nokia = new Phone();
        Phone samsung = new Phone();
        System.out.println(nokia.model);
//        System.out.println(lg.number);
        System.out.println(samsung.model);

        samsung.model="samsung";
//        lg.model= "lg";
//        lg.weight= nokia.weight;
//
//        System.out.println(lg.receiveCall("Vasya"));

        System.out.println(samsung.model);
//        System.out.println(lg.model);

        nokia.number = "+2385";

        System.out.println(nokia.getNumber());





        Lg lg = new Lg();
        lg.receiveCall("String", "Vasaya");


    }

    public static void anotherTask(String[] args){
        Person person = new Person();
        Person person1 = new Person("lub", 3);

    }
}
