package com.mysite;

import java.util.Scanner;

public class codewars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Which task do  you want to start");
        String task = in.next();

        switch (task) {
            case "1": {
                System.out.println(multiTable());
                break;
            }
            case "2": {
                System.out.println(DuplicateEncoder());
                break;
            }
            case "3": {
                System.out.println(sortArray());
                break;
            }
            case "4": {
                System.out.println(InttoString());
                break;
            }
            case "5": {
                System.out.println(triangle());
                break;
            }
            case "6": {
                secondsInTime();
                break;
            }
            case "7": {
                Test();
                break;
            }
            case "8": {
                revers();
                break;
            }
            case "9": {
                For();
                break;
            }

            default:
                System.out.println("wrong task");

        }
    }

    public static String multiTable() {
        int num = 2;
        String arr1[] = new String[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = String.format("%d * %d = %d", i + 1, num, (i + 1) * num);
        }
        return String.join("\n", arr1);
    }


    public static String DuplicateEncoder() {

        String word = "abacasa";
        word = word.toLowerCase();

        String unique = "";

        for (int i = 0; i < word.length(); i++) {

            char r = word.charAt(i);

            if (word.lastIndexOf(r) == word.indexOf(r)) {
                unique += "(";
            } else {
                unique += ")";
            }
        }

        return unique;
    }


    public static int[] sortArray() {
        int[] array = {2, 4, 56, 7};
        if (array.length == 0)
            return array;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[i] && array[j] % 2 != 0) {
                        int res = array[i];
                        array[i] = array[j];
                        array[j] = res;
                    }
                }
            }
        }
        return array;
    }

    public static int[] InttoString() {
        int number = 110101;
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }

        return numbers;
    }


    public static char triangle() {
        String row = "GBR";
            char g = 'G';
            char b = 'B';
            char r = 'R';
            char triangle = ' ';
            char [] Srow = row.toCharArray();
            for (int i=0; i<row.length()-1; i++){
                if (Srow[i]==Srow[i+1]){
                    triangle = Srow[i];
                    break;
                }
                else if (Srow [i]!=Srow[i+1]){
                    if (Srow [i] == g && Srow [i+1]==b){
                        System.out.println(Srow[i] +"+" +Srow[i+1]);
                        triangle = r;
                        break;

                    }

                    else if (Srow [i] == r && Srow [i+1]==b){
                        System.out.println(Srow[i] +"+" +Srow[i+1]);

                        triangle = g;
                        break;
                    }
                    else {
                        triangle = b;
                        System.out.println(Srow[i] +"+" +Srow[i+1]);
                        break;
                    }
                }
                System.out.println(Srow[i] +"+" +Srow[i+1]);
            }
            return triangle;
        }

    public static void secondsInTime() {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            int hours = input%(24*60*60)/(60*60);
            int minutes = ((input%(24*60*60)%(60*60))/60);
            int second = input%(24*60*60)%(60*60)%60;

            System.out.format("%02d" +":" +"%02d" +":" +"%02d", hours, minutes, second);
        }



        public static void Test() {
            int  n = 30;
            int  x = 1;

            while (n>=x){
                System.out.println(x);
                x *=x;
            }

        }

    public static void revers() {
            long number = 12344546;
            long length = (long)Math.log10(number)+1;
            long result = 0;
            while(length>0){
                long amount = (long)((number%10)*(Math.pow(10, length-1)));
                result +=amount;
                length--;
                number = (long)(number/10);

            }

            System.out.print(result);
        }
    public static void For() {
         int n = 20;
        for (int i=1; i<n; i++){
            if (i%2==0 && i%3==0){
                System.out.print(i + " ");

            }


        }
    }
}






















