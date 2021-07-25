package Lessons12.Switch;

import Lessons12.Switch.DaysWeek;

public class EnumTesting {
    static DaysWeek daysWeek = DaysWeek.Friday;

    public static void main(String[] args) {

        switch (daysWeek.indexOfWeek) {
            case 1: {
                printWeekName();
                break;
            }
            case 2: {
                printWeekName();
                break;
            }
        }
//        printFullWeek();
    }
        private static void printWeekName () {
            System.out.println("Today is " + daysWeek.name());
        }

//         private static void printFullWeek(){
//        DaysWeek [] fullWeek = DaysWeek.values();
//        for(DaysWeek day: DaysWeek.values()){
//            System.out.println(day.name());
//        }

         }




