package Naveen_Automation_Labs.Collection.Map;

import java.util.*;

public class  CompareHashMaps {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3,"C");
        map2.put(1,"A");
        map2.put(2,"B");

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"C");
        map3.put(3,"D");

        //1. On the basis of equals()
        System.out.println(map1.equals(map2));//true
        System.out.println(map1.equals(map3));//false

        //2. Compare hashmaps for the same keys: keySet()
        System.out.println(map1.keySet().equals(map2.keySet()));//true
        System.out.println(map1.keySet().equals(map3.keySet()));//true // Because it will ignore the duplicate and store until 3-C, since it is a set.

        //3. Find out the extra key
        Map<Integer, String> map4 = new HashMap<>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");

        //Combine the keys from both the maps: HashSet stores only unique values
        Set<Integer> combineKeys = new HashSet<>(map1.keySet());
        //Add the keyset from map4:
        combineKeys.addAll(map4.keySet());
        //Remove the keySet from map1, so only distinct will remain
        combineKeys.removeAll(map1.keySet());
        System.out.println("Extra key " + combineKeys);

        //4. Compare maps by values.
        Map<Integer, String> map5 = new HashMap<>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");

        Map<Integer, String> map6 = new HashMap<>();
        map6.put(4,"A");
        map6.put(5,"B");
        map6.put(6,"C");

        Map<Integer, String> map7 = new HashMap<>();
        map7.put(1,"A");
        map7.put(2,"B");
        map7.put(3,"C");
        map7.put(4,"C");

        //1. Duplicates are not allowed : using ArrayList
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false // ArrayList will not ignore 4-C, as it allows duplicate values

        //2. Duplicates are allowed : Using HashSet
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));//true
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true
    }
}
