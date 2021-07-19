package Lessons_10.Task;

public class Rectangle extends Shape{
    String coordinates;

    public Rectangle(String coordinates) {
        this.coordinates = coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    void draw() {
        System.out.println(coordinates);

    }
}
