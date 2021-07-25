package Lessons_10.TaskAnim;

import Lessons_10.Task.Shape;
import lessons_9.Student.Student;

public class MainClassAnimall {
    private static String food = "fish";


    public static void main(String[] args) {
        Animal[] animalls = new Animal[3];
        animalls[0] = new Cat("fish", "on the bad", "May", "Cat");
        animalls[1] = new Dog("meat", "near the bad", "Gav", "Dog");
        animalls[2] = new Horse("grows", "in stall", "Igo-go", "Horse");
        Veterenar veter = new Veterenar();

        for (Animal animal2 : animalls) {
            veter.treatAnimal(animal2);

        }

    }
}