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
//            case "2": {
//                printSmth();
//                break;
//            }
//            case "3": {
//                printWord("Current task =" + task);
//                break;
//            }
//            case "4": {
//                new_method();
//                break;
//            }

            default:
                System.out.println("wrong task");

        }
    }

    public static String multiTable() {

            int num = 2;
            String result = "";
            int i = 1;
            while (i<11){
                if (i==10){
                    result +=String.format("%d", i) +" * " +String.format("%d", num) +" = "
                            +String.format("%d",num*i);
                    break;
                }

                result +=String.format("%d", i) +" * " +String.format("%d", num) +" = "
                        +String.format("%d",num*i)+'\n';
                i++;
            }
            return result;
        }
    }


