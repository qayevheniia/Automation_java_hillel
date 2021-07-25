package Lessons12.Task;

import java.util.Scanner;

public class AnotherWay {
    public static void main(String[] args) {


    VarEnum [] varEnums = VarEnum.values();
    int index;
    Scanner in = new Scanner(System.in);
     System.out.println("PLease enter any number between 1-4");
     index = in.nextInt();
        System.out.println(varEnums[index]);
        }
    }

