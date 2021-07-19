package Lessons_10.TaskAnim;

public class Dog extends Animal{
    private String noice;

    public Dog(String food, String location,  String noice) {
        super(food, location);
        this.noice = noice;
        super.sleep();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    void makeNoise() {

    }
}
