package com.mysite;
import java.util.Scanner;

public class les_2_math_pow_float_random {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Which task do you want to start");
        String task = in.next();

        switch (task) {

            case "1": {
                converter();
                break;
            }
            case "2": {
                converter_in_years();
                break;
            }
            case"3": {
                body_mass_index();
                break;
            }
            case "4": {
                converter_km();
                break;
            }
            case "5": {
                random_number();
                break;
            }
            default:
                System.out.println("wrong number of task");

        }
    }
/*1. Write a Java program that reads a number in inches, converts it to meters.
                Note: One inch is 0.0254 meter.
                Test Data
        Input a value for inch: 1000
        Expected Output :
        1000.0 inch is 25.4 meters
 */


           private static boolean converter () {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a value for inch: ");
            float value_inh = in.nextFloat();
            float inh_meter = 0.0254f;
            System.out.println(value_inh + " inch is " + value_inh * inh_meter + " meters");
            return false;
           }

/*2. Write a Java program to convert minutes into a number of years and days.
Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days
*/
            private static void  converter_in_years () {

            Scanner in = new Scanner(System.in);
            System.out.print("Input the number of minutes: ");
            int value_in_minutes = in.nextInt();
            int in_days = value_in_minutes / (60 * 24);
            int in_year = in_days / 365;
            int years_days = in_days % 365;

            System.out.println(value_in_minutes + " minutes is approximately "
                    + in_year + " years" + " and " + years_days + " days");
        }

    /*3. Write a Java program to compute body mass index (BMI).
Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721*/

        private static void body_mass_index () {

            Scanner in = new Scanner(System.in);

            System.out.print("Input weight in pounds: ");
            double weight_pounds = in.nextDouble();
            System.out.print("Input height in inches: ");
            double height_in_inh = in.nextDouble();
            double pound_in_kg = 0.4535923745;
            double inh_in_meters = 0.0254;
            int sqr = 2;
            System.out.println("Body Mass Index is " + (weight_pounds * pound_in_kg) / ((Math.pow(height_in_inh * inh_in_meters, sqr))));
        }

/*4. Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513*/

    private static void converter_km () {

    Scanner in = new Scanner(System.in);

    System.out.print("Input distance in meters: ");
    float distance = in.nextFloat();
    System.out.print("Input hour: ");
    float hours = in.nextFloat();
    System.out.print("Input minutes: ");
    float minutes = in.nextFloat();
    System.out.print("Input seconds: ");
    float seconds = in.nextFloat();
    float in_min_sec = 60;
    float meters_km = 1000;

    System.out.println("Your speed in meters/second is " + (distance / ((hours * in_min_sec * in_min_sec) + (minutes * in_min_sec) + seconds)));
    System.out.println("Your speed in km/h is " + ((distance / meters_km) / (hours + (minutes / in_min_sec) +
            (seconds / in_min_sec / in_min_sec))));
}


//5. Write a Java program to generate random integers in a specific range.(Hint: Use Math class)

          private static void random_number () {

            Scanner in = new Scanner(System.in);
            System.out.print("\nInput minimum number: ");
            int minimum = in.nextInt();
            System.out.print("Input maximum  number: ");
            int maximum = in.nextInt();
            System.out.println("random integer = " + ((minimum + (int) (Math.random() * (maximum - minimum)))));

    }
}




