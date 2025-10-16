package Naveen_Automation_Labs.Collection.Map;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
    public static void main(String[] args) {
        //1. using hashMap class
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",100);
        map1.put("B",200);
        map1.put("C",300);

        System.out.println(map1.get("A"));

        //2. Immutable with only 1 single entry
        Map<String,String> map2 = Collections.singletonMap("test","CA");

        //3. JDK 8
        //Creating 2D array of Strings and using Streams to collect in the map
        Map<String, String> map3 = Stream.of(new String[][] {
            {"Tom","A"},
            {"Pom","B"}
        }).collect(Collectors.toMap(data -> data[0], data-> data[1]));

        System.out.println(map3.get("Tom"));

        //4. using of Simple Entry
        Map<String,String> map4 = Stream.of(
                new AbstractMap.SimpleEntry<>("Tom","Java"),
                new AbstractMap.SimpleEntry<>("Rom","Java"),
                new AbstractMap.SimpleEntry<>("Pom","Java")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(map4);

        //5. JDK 1.9
        Map<String,String> emptyMap = Map.of();
        //emptyMap.put("Pop","IOP");
        //System.out.println(emptyMap.get("Pop"));//UnsupportedOperationException

        //.6 Singleton Map JDK 1.9
        Map<String,String> singletonMap = Map.of("k1","v1");
        System.out.println(singletonMap.get("k1"));

        //7. Multi Values Map : max 10 key pairs
        Map<String,String> multiMap = Map.of("k1","v1", "k2","v2", "k3","v3","k4","v4");
        System.out.println(multiMap.get("k3"));

        //8. Map Of Entries

        Map<String,Integer> entriesMap = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A",100),
                new AbstractMap.SimpleEntry<>("B",200),
                new AbstractMap.SimpleEntry<>("C",300)
        );
        System.out.println(entriesMap.get("C"));

    }
}
