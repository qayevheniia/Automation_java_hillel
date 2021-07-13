package com.mysite;

public class Phone {
//    создаем коструктор этого класса

    String number = "+123456";
    String model = "yea";
    Integer weight= 102;

// public или rivate
    public String receiveCall(String name){
        String message = "Calling"+ name;
        return message;

    }

    public String getNumber() {
        return number;
    }




}
