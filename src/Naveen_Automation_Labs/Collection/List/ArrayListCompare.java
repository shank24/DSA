package Naveen_Automation_Labs.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCompare {
    public static void main(String[] args) {
        //1. sort and then equal
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,10));
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        Collections.sort(arr1);
        Collections.sort(arr2);

        //for(Integer val:arr1)
            //System.out.println(val);

        System.out.println(arr1.equals(arr2));
        System.out.println(arr1.equals(arr3));

        //2. Compare two list and find additional element
        List<Integer> arr4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> arr5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,10));

        //This will keep only the element in arr4, which is not in arr5 -: 9
        //arr4.removeAll(arr5);
        //System.out.println(arr4);

        //3. Find out the missing elements.
        arr5.removeAll(arr4);
        System.out.println("Arr 5 " + arr5);

        //4. Find out the common elements.
        List<Integer> arr6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> arr7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,10));

        arr6.retainAll(arr7);
        System.out.println(arr6);
    }
}
