package pageObject;

import java.util.Scanner;

public class Utils {
    public static String readParameter(String inputParameterName) {
        Scanner in = new Scanner(System.in);
        String message = new StringBuilder().append("Please, enter ").append(inputParameterName).toString();
        System.out.println(message);
        return  in.next();
    }
}
