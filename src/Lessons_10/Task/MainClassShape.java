package Lessons_10.Task;

import java.awt.*;

public class MainClassShape {
    private static  String circleCoord = "56.66";
    private static String rectangleCoord = "65.65";

    public static void main(String[] args) {
        Shape []  myObjects = new Shape [2];

        myObjects[0]= new Сircle(circleCoord);
        myObjects[1]= new Rectangle(rectangleCoord);

       for (Shape shape: myObjects){
           shape.draw();
       }}
}
