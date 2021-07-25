package InterfaceLes11;

import java.util.Arrays;
import InterfaceLes11.details.Engine;
import InterfaceLes11.details.EngineClass;
import InterfaceLes11.professions.Driver;
import InterfaceLes11.vehicles.CarClass;
import InterfaceLes11.vehicles.Lorry;
import InterfaceLes11.vehicles.SportClass;

public class Demo {
    public static void main(String[] args) {
        Driver  driverLarry = new Driver("Петрович", 45);
        EngineClass engineLarry = new EngineClass(500, "Scania");

        Driver driverSportCar = new Driver("Олег", 20);
        EngineClass engineSportCar = new EngineClass(750, "V8");


        Lorry lorry = new Lorry("Зил", "Грузовик", 4563, driverLarry, engineLarry, 1.5);
        SportClass sportCar = new SportClass("Ferrari", "SportCar", 2.5, driverSportCar, engineSportCar, 456);
        CarClass[] cars = {lorry, sportCar};


        for (CarClass cars1 : cars) {
            System.out.println(cars1);

        }
    }
}
