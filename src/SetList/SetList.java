package SetList;

import java.util.HashSet;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
//        сеты нужны чтоб иметь список уникальных и сортировочных значений
        // дубликаты не добавляются в список
        Set<String> mySet = new HashSet<>();

        mySet.add("E");
        mySet.add("B");

        mySet.add("C");

        mySet.add("D");

        mySet.add("F");

        mySet.add("A");
        System.out.println(mySet);

//        не добавляет дублежи!!!

        Boolean isAdded= mySet.add("E");
        System.out.println(isAdded);
        System.out.println(mySet);
        if (!isAdded) System.out.println("Element already exist");
        if(mySet.add("K")) System.out.println("Element added");
        System.out.println(mySet);

// info about size
        System.out.println(mySet.size());

//        remove special symbolls
        mySet.remove("A");
        System.out.println(mySet);

// найти конкретный обьект
        if(mySet.contains("A")) System.out.println("Yes, it is!");
        else System.out.println("Nope!");

//        return hashcode our set
        System.out.println(mySet.hashCode());



    }




}
