package Lessons_10.TaskAnim;

public class Cat extends Animal{

   private String noice;


    public Cat(String food, String location,  String noice, String animal) {
        super(food, location, animal);

        this.noice = noice;

        super.sleep();
    }


    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void makeNoise() {
        System.out.println(noice);

    }
}
