package Lessons_10.Task;

public class Сircle extends Shape {
    private String coordinates;

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Сircle(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    void draw() {
        System.out.println(coordinates);

    }
}

