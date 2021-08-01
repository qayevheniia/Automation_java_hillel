package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        List<String> myCollection = new ArrayList<>();
        myCollection.add("Hello");
        myCollection.add("Hi");

        myCollection.add("Aloha");
        myCollection.add("Privet");
        myCollection.add("Bonjur");

        System.out.println(myCollection);
//добавляем в аррей елемент на определенный индекс, при этом двигается весь список
        myCollection.add(2,"Two");
        System.out.println(myCollection);
//        возвращаем значение за определенным индексом
        System.out.println(myCollection.get(2));
//        находим индекс  элемент за значением
        System.out.println(myCollection.indexOf(new String("Two")));
//        ищем значение через переменную
        String myString = "Privet";
        System.out.println(myCollection.indexOf(new String(myString)));

        myCollection.remove(2);
        System.out.println(myCollection);
//        удаляем по значению
        myCollection.remove("Hi");
        System.out.println(myCollection);
// проверяем точно ли удалилось значение и получаем рузельтат true ли false
        Boolean isDeleted = myCollection.remove("bhj");
        System.out.println(isDeleted);
//        удаляет определенный кусок листа с определенного индекса по определенный индекс

        myCollection.remove(myCollection.subList(2,4));
        System.out.println();
        myCollection.add("Aloha");
        myCollection.add("Privet");
        myCollection.add("Bonjur");

//        сравниваем элементы
        System.out.println(myCollection.get(2).equals("Hi"));

//        оздаем новый список из уже существующего

        List<String> myNewCollection = new ArrayList<>(myCollection);
        System.out.println(myNewCollection);
//        задаем новому списку возможную длину
        List<String> myNewCollection2 = new ArrayList<>(50);





        System.out.println(myNewCollection);
        System.out.println(myCollection);
//        содержит или нет возвращает тру или фолс
        myCollection.contains("Hi");

//        сет - сетит значение для конкретного элемента
        myCollection.set(0, "Hello there");
        System.out.println(myCollection);

        int size = myCollection.size();
        System.out.println(size);

        for (String name: myCollection
        ) {
            if (name.equals("Aloha")) System.out.println("We have Aloha");
        }

        Boolean isEqualTo = myCollection.equals(myNewCollection2);
        System.out.println(isEqualTo);
        List<String> myNewCollection3 = new ArrayList<>(myCollection);

        Boolean isEqualTo2 = myNewCollection3.equals(myCollection);
        System.out.println(isEqualTo2);
//        чищаем полностью весь лист
        myCollection.clear();




    }
}
