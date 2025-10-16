package Naveen_Automation_Labs.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics  {
    public static void main(String[] args) {

        //No order, No indexing.
        //Stores value - Key/Value
        //Key cannot be duplicate
        //Can store n number of null values, but only 1 null key
        //Hashmap is not thread safe, but hashset is.

        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("India", "New Delhi");
        capitalMap.put("China", "Beijing");
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "London");
        capitalMap.put("UK", "London11");
        capitalMap.put(null, "Berlin");
        capitalMap.put("France", null);
        capitalMap.remove("France");


        System.out.println(capitalMap.get("India"));
        //It will give the latest value - London11
        System.out.println(capitalMap.get("UK"));
        //It will give the latest value - LA
        System.out.println(capitalMap.get(null));

        //Iterator - over the keys: by using keyset()
        Iterator<String> it = capitalMap.keySet().iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = capitalMap.get(key);
            System.out.println("Keys = : " + key + " Values = : " + value);
        }

        System.out.println("-----------");
        //Iterator - over the set pairs: by using entrySet
        Iterator<Map.Entry<String, String>> it1 = capitalMap.entrySet().iterator();
        while (it1.hasNext()){
            Map.Entry<String, String> entry = it1.next();
            System.out.println("Key1 : " + entry.getKey() + " Value : " + entry.getValue());
        }

        System.out.println("-----------");
        //Using java 8
        capitalMap.forEach((k,v) -> System.out.println("Key2 = : " + k + " Value2 = : " +  v));

    }
}
