package Naveen_Automation_Labs.Collection.List;

import DSA_Challenges.Start.strings.InsertString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println("Typical For Loop");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("For Each");

        for(Integer e:arrayList)
            System.out.println(e);

        System.out.println("Lambda");

        //Java 8
        arrayList.stream().forEach(ele -> System.out.println(ele));

        System.out.println("Iterator");
        //Iterator
        Iterator<Integer> iter = arrayList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        List<Integer> arr1 = new ArrayList<>(Arrays.asList(10,20,30));
        System.out.println(arr1);
    }
}
