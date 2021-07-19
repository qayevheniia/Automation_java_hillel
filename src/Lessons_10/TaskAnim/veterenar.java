package Lessons_10.TaskAnim;

public class veterenar extends Animal {

    public veterenar(String food, String location) {
        super(food, location);

    }


    public veterenar() {
    }

    void treatAnimal(Animal animal){
        System.out.println(" like eat " +getFood());
        System.out.println(" like sleep " +getLocation());

    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    void makeNoise() {

    }
}
