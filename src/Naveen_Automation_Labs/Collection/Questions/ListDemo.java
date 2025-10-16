package Naveen_Automation_Labs.Collection.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8));


        list2.retainAll(list1);
        System.out.println(list2);

        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
