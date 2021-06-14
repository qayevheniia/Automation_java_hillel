package com.mysite;

import java.util.Scanner;
public class les_3_if_switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to start");
        String task = in.next();

        switch (task) {

            case "1": {
                access_3_status();
                break;
            }
            case "2": {
                access_2_status();
                break;
            }
            case"3": {
                period_of_day();
                break;
            }
            case "4": {
                day_in_week();
                break;
            }
            case "5": {
                error_length();
                break;
            }
            case "6":
                access_equals();
                break;
            case "7": {
                converter_summ_days();
                break;
            }
            default:
                System.out.println("wrong number of task");

        }
    }
            private static void access_3_status() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter your age and press Enter");
            int number = in.nextInt();
            int age = 18;

            if (number > age) {
                System.out.println("Welcome");
            } else if (number == age) {
                System.out.println("Sorry, wait a bit");
            } else {
                System.out.println("Sorry, denied");
            }
        }
        private static void access_2_status() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please, enter your age and press Enter");
            int target_age = 20;
            int age1 = in.nextInt();
            String result = (age1 >= target_age) ? "Welcome" : "Sorry, denied";
            System.out.println(result);
        }

    private static void period_of_day() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter time: ");
        int time = in.nextInt();
        if (time>18)
        {
            System.out.println("Good evening");
        }
        else if (time<10){
            System.out.println("Good morning");
        }
        else {
            System.out.println("Otherwise Good day");
       }
    }
    private static void day_in_week() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter time: ");
        int time1 = in.nextInt();

        String result1 = (time1 > 18) ? "Good evening" : "Otherwise Good day";
        System.out.println(result1);

        System.out.println("Please, enter number of week day ");
        int number_week = in.nextInt();

        switch (number_week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }

    private static void error_length() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter length ");
        int length = in.nextInt();
        System.out.println("Please, enter any word ");
        String word = in.next();
        if (word.length() > length) {
            System.out.println("Error");
        }
    }

    private static void access_equals() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your name ");
        String name = in.next();
        System.out.println("Please, enter your password ");
        String password = in.next();
        String def_name = "Yuriy";
        String def_password = "pass";

        if ((name.equals(def_name)) && (password.equals(def_password))) {
            System.out.println("login successful");
        } else {
            System.out.println("Error");
        }
    }

//        Write a Java program to find the number of days in a month.
//
//        Test Data
//        Input a month number: 2
//        Input a year: 2016
//        Expected Output :
//        February 2016 has 29 days

    private static void converter_summ_days() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a month number");
        int month_number = in.nextInt();

        System.out.println("Please, enter year");

        int year = in.nextInt();

        String monthString;
        switch(month_number) {
            case 1:
                monthString = ("January");
                break;
            case 2:
                monthString = ("February");
                break;
            case 3:
                monthString = ("March");
                break;
            case 4:
                monthString = ("April");
                break;
            case 5:
                monthString = ("May");
                break;
            case 6:
                monthString = ("June");
                break;
            case 7:
                monthString = ("July");
                break;
            case 8:
                monthString = ("August");
                break;
            case 9:
                monthString = ("September");
                break;
            case 10:
                monthString = ("October");
                break;
            case 11:
                monthString = ("November");
                break;
            case 12:
                monthString = ("December");
                break;
            default:
                monthString = "Don't know  this number of month";
                break;

        }
        int numDays = 0;
        switch(month_number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            case 4:
            case 11:
            case 6:
            case 9:
                numDays = 30;
                break;
            default:
                break;

        }

        {
            System.out.println(monthString +" " +year + " has " +numDays +" days");
        }
    }
}


