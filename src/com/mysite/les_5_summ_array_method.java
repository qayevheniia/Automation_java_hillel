package com.mysite;

import java.util.Scanner;
//        Write a method which returns the sum of a
//        given array
public class les_5_summ_array_method {
    public static void main(String[] args) {

        System.out.println(summOfArray());

    }

    public static int summOfArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int summ = 0;
        int size = in.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter number");
            a[i] = in.nextInt();}

        for (int b = 0; b < a.length; b++) {
            summ +=a[b];
        }
        return summ;
    }
}


