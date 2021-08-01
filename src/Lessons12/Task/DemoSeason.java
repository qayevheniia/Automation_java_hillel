package Lessons12.Task;

import javax.swing.*;
import java.lang.management.PlatformLoggingMXBean;
import java.util.Scanner;

public class DemoSeason {

    public static void main(String[] args) {

        System.out.println("PLease enter any number between 1-4");
       int code;

        Scanner in = new Scanner(System.in);
        code = in.nextInt();
        if (code>4 || code<=0){
            System.out.println("PLease put correct number");
        }
        else {
            VarEnum varEnum = VarEnum.getGenderByCode(code);

            VarEnum season = VarEnum.valueOf(varEnum.toString());

            switch (season) {

                case Summer:
                case Spring:
                case Autumn:
                case Winter: {
                    System.out.println(season.name());
                    break;
                }

                default: {
                    System.out.println("Wrong number");
                    break;
                }

            }


        }
    }
//    public class Demo2{
//        public static void main(String[] args) {
//            int code;
//            Scanner in = new Scanner(System.in);
//            code = in.nextInt();
//            VarEnum varEnum= VarEnum.getGenderByCode(code);
//
//            System.out.println(varEnum);
//        }
//    }
}