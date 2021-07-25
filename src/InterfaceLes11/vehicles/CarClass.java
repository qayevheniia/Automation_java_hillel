package InterfaceLes11.vehicles;

import InterfaceLes11.details.EngineClass;
import InterfaceLes11.professions.Driver;

public abstract class CarClass implements Car{
    //Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
    private String mark;
    private String classAuto;
    private double weight;
    private  Driver driver;
    private EngineClass engine;

    public CarClass(String mark, String classAuto, double weight, Driver driver, EngineClass engine) {
        this.mark = mark;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public void turnRight() {
        Car.super.turnRight();
    }

    @Override
    public void stop() {
        Car.super.stop();
    }

    @Override
    public void turnLeft() {
        Car.super.turnLeft();
    }

    @Override
    public String toString() {
        return "Car:" +"\nMarka is " +mark
                +"\nClassAuto is " +classAuto
                +"\nWeight Auto is " +weight
                +"\nDriver is " +driver
                +"\nMotor is " +engine;
    }

    @Override
    public void start() {
        Car.super.start();
    }
}
