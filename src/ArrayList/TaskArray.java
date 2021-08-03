package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TaskArray {

//    Christmas is coming, and Santa has a long list to go through, to find who deserves presents for the big day.
//Go through a list of children, and return a list containing every child who appeared on Santa's list
//
//1st Santa's list = "Jason", "Jackson", "Jordan", "Johnny"
//2nd children list = "Jason", "Jordan", "Jennifer"

    public static void main(String[] args) {

        List<String> SantaList = new ArrayList<>();
        SantaList.add("Jason");
        SantaList.add("Jackson");
        SantaList.add("Jordan");
        SantaList.add("Johnny");

        List<String> ChildrenList = new ArrayList<>();
        ChildrenList.add("Jason");
        ChildrenList.add("Jordan");
        ChildrenList.add("Jennifer");


        List<String> newList = new ArrayList<>();


        for (String name: SantaList
        ) {
            if (ChildrenList.contains(name))
                newList.add(name);
        }
        System.out.println(newList);

    }

}
