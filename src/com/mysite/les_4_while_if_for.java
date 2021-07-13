package com.mysite;

import java.util.Scanner;

public class les_4_while_if_for {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Which task do you want to start");
            String task = in.next();

            switch (task) {

                case "1": {
                    while_lenght();
                    break;
                }
                case "2": {
                    access_with_3_attempts();
                    break;
                }
                case"3": {
                    summ_in_number();
                    break;
                }
                case "4": {
                    repeatStr();
                    break;
                }
                default:
                    System.out.println("wrong number of task");

            }
        }

        private static void while_lenght() {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter height");
            int height = in.nextInt();

            System.out.println("Enter width");
            int width = in.nextInt();
            int i = 0;

            while (i < height) {

                i++;
                {

                    for (int a = 0; a < width; a++) {

                        System.out.print("*");
                    }

                }
                System.out.println(" ");
            }
        }


    private static void access_with_3_attempts() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter your pass");
        String expected = "yev";
        int retries = 3;

        for (int a = 0; a < retries; a++) {
            String pass = in.next();


            if (pass.equals(expected)) {
                System.out.println("Correct, welcome back");
                break;
            } else if ((a == 2) && (expected != pass)) {
                System.out.println("Sorry but you have been locked out");

            } else {
                System.out.println("Incorrect, try again");
            }
        }
    }


//        Write a program that finds the summation of every number from 1 to num.
//        The number will always be a positive integer greater than 0.

//        https://nimb.ws/8PmHWr

    private static void summ_in_number() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = in.nextInt();

        int sum = 0;
        for (int b = 0; b <= num; b++) {
            sum += b;
        }
        System.out.println(sum);
    }

//        Write a function called repeatStr which repeats the given string string exactly n times.
//
//        repeatStr(6, "I") // "IIIIII"
//        repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

//        https://nimb.ws/tmQD1c

    private static void repeatStr() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time");
        int time = in.nextInt();

        System.out.println("Enter word");
        String word=in.next();

        for (int c=1; c<=time; c++) {
            System.out.print(word);
        }
    }

}


class Additional_task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to start");
        String task = in.next();

        switch (task) {

            case "1": {
                check_duplicate_in_array();
                break;
            }
            case "2": {
                appear_array();
                break;
            }
            case"3": {
                reverse_array();
                break;
            }
            case "4": {
                summ_in_array();
                break;
            }
            default:
                System.out.println("wrong number of task");

        }
    }

//            1. Program to print the duplicate elements of an array
//            In this program, we need to print the duplicate elements present in the array.
//            This can be done through two loops.
//            The first loop will select an element and the second loop will iteration through the array
//            by comparing the selected element with other elements.
//            If a match is found, print the duplicate element.
//
//             Program to print the duplicate elements of an array
//            In the above array, the first duplicate will be found at the index 4 which is the duplicate of the element (2) present at index 1. So, duplicate elements in the above array are 2, 3 and 8.
//
//            Algorithm
//            STEP 1: START
//            STEP 2: INITIALIZE arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.
//                    STEP 3: PRINT "Duplicate elements in given array:"
//            STEP 4: REPEAT STEP 5 to STEP 7 for(i=0; i<arr.length; i++)
//                STEP 5: REPEAT STEP 6 and STEP 7 for(j=i+1; j<arr.length; j++)
//                STEP 6: if(arr[i] == arr[j])
//                STEP 7: PRINT arr[j]
//            STEP 8: END

    private static void check_duplicate_in_array() {

        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }

//            2. Program to print the elements of an array
//            This is a simple program to create an array and then to print it's all elements.
//
//            Program to print the elements of an array
//            Here, 1, 2, 3, 4 and 5 represent the elements of the array. These elements can be accessed through their corresponding indexes, 1.e., 0, 1, 2, 3 and 4.
//
//            Algorithm
//            STEP 1: START
//            STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}.
//                    STEP 3: PRINT "Elements of given array:"
//            STEP 4: REPEAT STEP 5 for(i=0; i<arr.length; i++)
//                STEP 5: PRINT arr[i]
//            STEP 6: END

    private static void appear_array() {

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Elements of given array:");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }


//            3. Program to print the elements of an array in reverse order
//            In this program, we need to print the elements of the array in reverse order that is; the last element should be displayed first, followed by second last element and so on.
//
//                    Program to print the elements of an array in reverse order
//            Algorithm
//            STEP 1: START
//            STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}
//            STEP 3: PRINT "Original Array:"
//            STEP 4: REPEAT STEP 5 for(i=0; i<arr.length ; i++)
//                STEP 5: PRINT arr[i]
//            STEP 6: PRINT "Array in reverse order"
//            STEP 7: REPEAT STEP 8 for(i= arr.length-1; i>=0; i--)
//                STEP 8: PRINT a[i]
//            STEP 9: END

    private static void reverse_array() {

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        for (int c = 0; c < arr3.length; c++) {
            System.out.println(arr3[c]);
        }
        System.out.println("Array in reverse order");
        for (int c = arr3.length - 1; c >= 0; c--) {
            System.out.println(arr3[c]);
        }
    }

//            4. java Program to print the sum of all the items of the array
//            In this program, we need to calculate the sum of all the elements of an array. This can be solved by looping through the array and add the value of the element in each iteration to variable sum.
//
//            Java Program to print the sum of all the items of the array
//            Sum of all elements of an array is 1 + 2 + 3 + 4 + 5 = 15.
//
//            Algorithm
//            STEP 1: START
//            STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}
//            STEP 3: SET sum = 0
//            STEP 4: REPEAT STEP 5 UNTIL i<arr.length
//            //for(i=0; i< arr.length; i++)
//            STEP 5: sum = sum + arr[i]
//            STEP 6: PRINT "Sum of all the elements of an array:"
//            STEP 7: PRINT sum
//            STEP 8: END

    private static void summ_in_array() {
        int arr4[] = {1, 2, 3, 4, 5};
        int a = 0;
        for (int i = 0; i < arr4.length; i++) {
            a += arr4[i];
        }
        System.out.println("Sum of all the elements of an array: " + a);
    }

//        5. https://nimb.ws/H09Ahu
//        6. https://nimb.ws/KHZRv0
//        7. https://nimb.ws/x7G3Pr
//        8. https://nimb.ws/ur9Ey0
//        9. https://nimb.ws/j0mr2u
//          10. https://nimb.ws/H5ZOR7


    //    // https://nimb.ws/dUrqV6
//    https://nimb.ws/4r8vsK

//
    }




