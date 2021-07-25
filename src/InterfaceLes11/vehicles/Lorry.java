package InterfaceLes11.vehicles;

import InterfaceLes11.details.EngineClass;
import InterfaceLes11.professions.Driver;
//Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.

public class Lorry extends CarClass {
    private double carryingСapacity;

    public Lorry(String mark, String classAuto, int weight, Driver driver, EngineClass engine, double carryingСapacity) {
        super(mark, classAuto, weight, driver, engine);
        this.carryingСapacity = carryingСapacity;
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public String toString() {
        return "Car is Lorry" +"\nCarrying capacity is " +carryingСapacity +"\n" +super.toString();
    }

    @Override
    public void start() {
        super.start();
    }
}
