package Naveen_Automation_Labs.Collection.Map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1000, "Tom");
        map.put(2000, "Qom");
        map.put(3000, "Aom");
        map.put(4000, "Xom");
        map.put(5000, "Rom");

        map.forEach((k, v) -> System.out.println("key = " + k + " value = " + v));

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        //Keys less than 3000
        Set<Integer> keysLessThan3K = map.headMap(3000).keySet();
        System.out.println(keysLessThan3K);

        //Keys Greater than or equal to 3000
        Set<Integer> keysGreaterThan3K = map.tailMap(3000).keySet();
        System.out.println(keysGreaterThan3K);


        //Sorting on First Field - String - alphabetical order
        TreeMap<String,Integer> userMap = new TreeMap<>();
        userMap.put("James",100);
        userMap.put("Flames",200);
        userMap.put("Rames",150);
        userMap.put("Tames",500);
        userMap.put("Pames",400);

        userMap.forEach((k, v) -> System.out.println("key = " + k + " value = " + v));

        //In Descending Order
        TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());

        map1.put(1000, "Tom");
        map1.put(2000, "Qom");
        map1.put(3000, "Aom");
        map1.put(4000, "Xom");
        map1.put(5000, "Rom");

        map1.forEach((k, v) -> System.out.println("key = " + k + " value = " + v));

    }
}
