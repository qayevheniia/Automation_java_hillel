package Lessons_10.TaskAnim;

public class Cat extends Animal{

   private String noice;

    public Cat(String food, String location,  String noice) {
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
        System.out.println(noice);

    }
}
