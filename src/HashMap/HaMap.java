package HashMap;
import java.util.Map;
import java.util.HashMap;


public class HaMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Jason", 24);
        myMap.put("Jon", 11);
        myMap.put("Jorsh", 101);
        myMap.put("Ron", 11);

        Map<String, Integer> myMap2 = new HashMap<>();

        myMap2.put("Jason", 24);
        myMap2.put("Jon", 11);
        myMap2.put("Jorsh", 101);
        myMap2.put("Ron", 11);

        System.out.println(myMap);
//        о ключу получаем значение get
        System.out.println(myMap.get("Jorsh"));
        System.out.println(myMap.get("Jorsh").hashCode());

//        возвращает значения без кея
        System.out.println(myMap.values());

        System.out.println(myMap.containsKey("A"));
        System.out.println(myMap.containsKey("Ron"));

//        сравнивает два значения
        System.out.println(myMap.get("Ron").equals(5));

        System.out.println(myMap.get("Ron").equals("Roi"));

        System.out.println(myMap.equals(myMap2));

//        подменяем значения
        System.out.println(myMap.put("Ron", 20));
        System.out.println(myMap);








    }
}
