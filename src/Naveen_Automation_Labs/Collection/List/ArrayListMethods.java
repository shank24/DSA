package Naveen_Automation_Labs.Collection.List;

import java.util.*;

public class ArrayListMethods {

    public static void main(String[] args) {

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(11);
        arr1.add(21);
        arr1.add(31);
        arr1.add(1);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(22);
        arr2.add(32);

        //Adding at specific index
        arr1.addAll(2,arr2);
        System.out.println(arr1);

        //Clear
        //arr1.clear();
        //System.out.println(arr1);

        //Clone
        //ArrayList<Integer> arr3 = (ArrayList<Integer>) arr2.clone();
        //System.out.println(arr3);

        System.out.println(arr2.contains(2));
        System.out.println("Index :" + arr1.indexOf(1));
        System.out.println(arr1.lastIndexOf(1));
        System.out.println("Removed : " + arr1.remove(1));
        System.out.println("Removed : " + arr1.remove(2));

        List<Integer> arr4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        arr4.removeIf(num -> num%2 == 0);
        System.out.println(arr4);

        //Retain All
        System.out.println(arr1.retainAll(Collections.singleton(1)));
        System.out.println("Check " + arr1);

        //Sub List
        List<Integer> arr5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> arr6 = arr5.subList(2,5);
        System.out.println(arr6);

        //To array
        List<Integer> arr7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Object[] arr8 = arr7.toArray();
        System.out.println(Arrays.toString(arr8));
    }
}
