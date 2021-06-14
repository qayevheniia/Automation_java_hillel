package com.mysite;

import java.util.Scanner;

public class les_5_array_boolen_method {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Which task do  you want to start");
        String task = in.next();

        switch (task) {
            case "1": {
                System.out.println(checkContains());
                break;
            }
            case "2": {
                printSmth();
                break;
            }
            case "3": {
                printWord("Current task =" + task);
                break;
            }
            case "4": {
                new_method();
                break;
            }

            default:
                System.out.println("wrong task");

        }
    }

    private static void printWord(String word) {
        System.out.println(word);
    }

    private static boolean checkContains() {
        int[] array = {10, 13, 90};
        int expected = 13;
        boolean result = false;
        for (int value : array) {
            if (value == expected) {
                result = true;
            }
        }
        return result;
    }

    private static void printSmth() {
        for (int i = 1; i < 100; i++) {
            if ((i % 7) == 0) {
                System.out.println(i);
                System.out.println(", ");
            }
        }
    }

    private static void new_method() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int number = in.nextInt();
        System.out.println(test1(number));
    }

    public static boolean test1 ( int my_number){
        boolean result = false;
        if (my_number % 2 == 0) result = true;
        return result;

    }
}



