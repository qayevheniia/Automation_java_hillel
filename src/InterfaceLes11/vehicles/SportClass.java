package InterfaceLes11.vehicles;

import InterfaceLes11.details.Engine;
import InterfaceLes11.details.EngineClass;
import InterfaceLes11.professions.Driver;

public class SportClass extends CarClass {
       private int maxSpeed;
    public SportClass(String mark, String classAuto, double weight, Driver driver, EngineClass engine, int maxSpeed) {
        super(mark, classAuto, weight, driver, engine);
        this.maxSpeed=maxSpeed;
    }

    @Override
    public String toString() {
        return "\nCar is sport car" +super.toString() +"\nMax speed is " +maxSpeed;
    }
}

