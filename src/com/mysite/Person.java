package com.mysite;

public class Person {

    String fullname;
    int age;

    public void move(){
        System.out.print("Такой-то" +fullname + "говорит");
    }
    public void talk(){
        System.out.print("Такой-то" +fullname + "говорит");
    }

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Person() {

    }
}
