package InterfaceLes11.vehicles;
//Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
// Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
// "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
// А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
//        Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
//        Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
public interface Car {

    String toString();

    default  void start(){
        System.out.println("Поехали");
    }

    default void stop(){
            System.out.println("Останавливаемся");
        }
        default void turnRight(){
        System.out.println("Поворот направо");
    }
    default  void turnLeft(){
        System.out.println( "Поворот налево");
    }



}
