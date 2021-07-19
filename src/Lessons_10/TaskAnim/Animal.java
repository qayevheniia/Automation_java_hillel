package Lessons_10.TaskAnim;

public abstract  class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
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

    final public void sleep(){
        System.out.println("Такое-то животное спит");
    }

    public void eat(){
        System.out.println(food);
    }

    abstract void makeNoise();


}
