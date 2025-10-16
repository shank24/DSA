package Naveen_Automation_Labs.Collection.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks = new Hashtable<>();
        marks.put("Yammy", 100);
        marks.put("Qammy", 200);
        marks.put("Wammy", 300);
        marks.put("Eammy", 400);
        marks.put("Rammy", 500);

        System.out.println(marks.get("Yammy"));

    }
}
