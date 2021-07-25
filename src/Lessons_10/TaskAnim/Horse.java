package Lessons_10.TaskAnim;

public class Horse extends Animal {
    private String noice;


    public Horse(String food, String location, String noice, String animal ) {
        super(food, location, animal);
        this.noice = noice;

        super.sleep();
    }

    @Override
    public void makeNoise() {
        System.out.println(noice);
    }

    @Override
    public void eat() {
        super.eat();
    }
}
