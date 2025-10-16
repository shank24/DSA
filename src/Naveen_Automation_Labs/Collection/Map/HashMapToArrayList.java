package Naveen_Automation_Labs.Collection.Map;

import java.util.*;

public class HashMapToArrayList {
    public static void main(String[] args) {
        Map<String, Integer> map =new HashMap<>();
        map.put("Google",10000);
        map.put("Poogle",20000);
        map.put("Toogle",30000);
        map.put("Woogle",40000);

        System.out.println(map.size());
        Iterator it =  map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }

        System.out.println("---------------");
        map.forEach((k,v) -> System.out.println("key  : " + k + " = " + "value : " + v));

        System.out.println("---------------");

        //Convert hashMap keys to ArrayList
        List<String> compName = new ArrayList<>(map.keySet());
        for (String key: compName)
            System.out.println(key);


                System.out.println("---------------");

        //Convert hashMap values to ArrayList
        List<Integer> empCount = new ArrayList<>(map.values());
        for (Integer values: empCount)
            System.out.println(values);


    }
}
