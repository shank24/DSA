package Naveen_Automation_Labs.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizedArrayList {
    public static void main(String[] args) {
        //1st way
        List<Integer> arr1 = Collections.synchronizedList(new ArrayList<>());
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        //For fetch operation we need synchronized keyword
        synchronized (arr1){
            Iterator<Integer> it = arr1.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }

        //2. CopyOnWriteArrayList
        List<Integer> arr2 = new CopyOnWriteArrayList<>();
        arr2.add(11);
        arr2.add(22);
        arr2.add(33);

        Iterator<Integer> it = arr2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
