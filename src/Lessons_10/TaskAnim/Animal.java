package Lessons_10.TaskAnim;

//создаем асбтрактныц класс
public abstract class Animal {
    private String food;
    private String location;
    private String animal;

    //для свойст делаем сеттеры и гетеры
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    //конструктор
    public Animal(String food, String location, String animal) {
        this.food = food;
        this.location = location;
        this.animal = animal;
    }

    protected Animal() {
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //finnal - последний вариант метода
    final public void sleep() {
        System.out.println(getAnimal() + " спит");
    }


    public void eat() {
        System.out.println(food);
    }
//абстрактный метод только обьявляем, но реализовываем в классах

    public void makeNoise(){
        System.out.println("Такое-то животное спит");
    };

}
