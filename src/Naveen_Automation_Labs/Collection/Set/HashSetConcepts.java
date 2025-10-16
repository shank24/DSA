package Naveen_Automation_Labs.Collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");

        System.out.println(set);
        System.out.println(set.contains("Java"));

        for(String e: set)
            System.out.println(e);

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Set<Integer> firstSet = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        Set<Integer> secondSet = new HashSet<>(Arrays.asList(13,4,5,6));

        Set<Integer> unionSet = new HashSet<>(firstSet);
        unionSet.addAll(secondSet);
        System.out.println("Combining Both sets " + unionSet);

        Set<Integer> intersectionSet = new HashSet<>(firstSet);
        intersectionSet.retainAll(secondSet);
        System.out.println("Only Common Elements" + intersectionSet);

        Set<Integer> diffSet = new HashSet<>(firstSet);
        diffSet.removeAll(secondSet);
        System.out.println("Set 1 elem - Set 2 elem "  + diffSet);


    }
}
