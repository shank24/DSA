package Naveen_Automation_Labs.Collection.Questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1","A");
        map.put("2","B");
        map.put("3","C");
        map.put("4","D");

        map.forEach((k,v) -> System.out.println("Key = " + k + " " + "Value = "+ v ));

        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }

        Iterator <Map.Entry<String, String>> it1 = map.entrySet().iterator();
        while (it1.hasNext()){
            Map.Entry<String,String> entry = it1.next();
            System.out.println(entry.getKey() +" : " + entry.getValue() );
        }
    }
}
