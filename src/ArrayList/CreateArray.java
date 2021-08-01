package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CreateArray {
    public static void main(String[] args) {
//        создаем обьекты класса heavybox
        HeavyBox first = new HeavyBox(5);
        HeavyBox two = new HeavyBox(7);
        HeavyBox three = new HeavyBox(8);
        HeavyBox four = new HeavyBox(9);
        HeavyBox five = new HeavyBox(15);
        HeavyBox six = new HeavyBox(15);


//        List<HeavyBox> myBoxes = Arrays.asList(first,two,three, four, five, new HeavyBox(90));
//        System.out.println(myBoxes);

        List<HeavyBox> myBoxes = new ArrayList<>();
//        второй метод добавление еерея
        myBoxes.add(four);
        myBoxes.add(five);
        myBoxes.add(four);
        myBoxes.add(five);
        myBoxes.add(six);
        myBoxes.add(new HeavyBox(66));

        System.out.println(myBoxes.toString());

        for (HeavyBox name : myBoxes
        ) {
            System.out.println(name);
        }

        for (HeavyBox weight : myBoxes
        ) {
            System.out.println(weight.getWeight());
        }

        myBoxes.set(0, new HeavyBox(1));

        System.out.printf("First element weight = %d", myBoxes.get(0).getWeight());

//        удаляем последний элемент
        myBoxes.remove(myBoxes.size() - 1);
        myBoxes.clear();
    }
}
