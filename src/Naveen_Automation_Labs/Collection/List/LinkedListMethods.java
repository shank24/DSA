package Naveen_Automation_Labs.Collection.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        //LL is a default class in Java
        //It can be used as List, Stack, Queue
        //It allows the null entry
        //Dynamic collection
        //Deletion & Insertion can be easily implemented
        //Can contain duplicate elements
        //It is not thread safe.

        LinkedList<String> names = new LinkedList<>();
        System.out.println(names.size());
        names.add("Tom");
        names.add("Eom");
        names.add("Qom");
        System.out.println(names.size());

        System.out.println(names);
        System.out.println(names.get(0));

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        names.add(3,"Kom");
        System.out.println(names);

        //Shifting takes place
        names.add(1,"Ram");
        System.out.println(names);

        LinkedList<String> users = new LinkedList<>();
        users.add("Trump");
        users.add("Modi");
        names.addAll(users);
        System.out.println(names);

        names.addFirst("Kamala");
        System.out.println(names);

        names.removeAll(users);
        System.out.println(names);

        Iterator<String> itr = names.descendingIterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }

        Collections.sort(names);
        System.out.println(names);

    }
}
