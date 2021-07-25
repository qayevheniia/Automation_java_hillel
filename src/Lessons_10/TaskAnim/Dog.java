package Lessons_10.TaskAnim;

public class Dog extends Animal{
    private String noice;


    public Dog(String food, String location,  String noice, String animal) {
        super(food, location, animal);
        this.noice = noice;
        super.sleep();
    }

    @Override
    public void eat()   {
        super.eat();
    }

    @Override
    public void makeNoise() {
        System.out.println(noice);
    }
}
