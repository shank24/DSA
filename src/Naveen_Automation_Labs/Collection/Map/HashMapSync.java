package Naveen_Automation_Labs.Collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class HashMapSync {
    public static void main(String[] args) {
        Map<String,String> map1 =new HashMap<>();
        map1.put("1","Pop");
        map1.put("2","Top");
        map1.put("3","Rop");

        Map<String,String> syncMap = Collections.synchronizedMap(map1);

        syncMap.forEach((k,v) -> System.out.println("key : " + k + " val :" + v));
        System.out.println(syncMap);

        //ConcurrentHashMap: it does not throw any ConcurrentModificationException
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("A","Java");
        concurrentHashMap.put("B","PHP");
        concurrentHashMap.put("C","C++");

        concurrentHashMap.forEach((k,v) -> System.out.println("key : " + k + " val :" + v));

    }
}
