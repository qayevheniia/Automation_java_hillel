package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TaskMapSet {

//Создать по пять объектов обоих классов и добавить их в Map, где ключ Driver, значение CarM.
//
//посчитать сколько водителей ездят на electro автомобилях

    public static void main(String[] args) {


        CarM toyota = new CarM("Yaris", Engine.gas);
        CarM kia = new CarM("Yaris", Engine.disel);
        CarM vaz = new CarM("Yaris", Engine.gas);
        CarM mitsub = new CarM("Yaris", Engine.electro);
        CarM lexus = new CarM("Yaris", Engine.electro);


        Driver voloda = new Driver(toyota, "Володя");
        Driver zheka = new Driver(kia, "Жека");
        Driver igor = new Driver(vaz, "Игорь");
        Driver leonid = new Driver(mitsub, "Леонид");
        Driver yulia = new Driver(lexus, "Юля");

        Map<Driver, CarM> myMap = new HashMap<>();

        myMap.put(voloda, toyota);
        myMap.put(zheka, kia);
        myMap.put(igor, vaz);
        myMap.put(leonid, mitsub);
        myMap.put(yulia, lexus);

        int i = 0;

//        for (Map.Entry<Driver, CarM> myMap1 : myMap.entrySet())
//         {
//            if (myMap1.getValue().engine.equals(Engine.electro)) {
//                i+=1;
//
//            }
//
//        }
                for ( CarM myMap1 : myMap.values())
         {
            if (myMap1.engine.equals(Engine.electro)) {
                i+=1;

            }

        }
        System.out.println(i);

    }
}
