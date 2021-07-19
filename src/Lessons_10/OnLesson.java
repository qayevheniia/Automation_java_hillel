package Lessons_10;
//final method - final method and it can't be overribben
// final class - class that can't be extended
// super method - if your method overrides one of it's superclass's methods you van invoike the overribben . Needs to use super
 abstract class OnLesson {
     int age;

    abstract void walk();

    String setAge(){
        age=1;
        return "Igor" +age +"year";
    }
    abstract void tellName();

//    public static void main(String[] args) {
//        final int radius = 1;}



//        radius = 5; - this is mistake and we can't do it
}
