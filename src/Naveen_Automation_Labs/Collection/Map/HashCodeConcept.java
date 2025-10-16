package Naveen_Automation_Labs.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeConcept {
    public static void main(String[] args) {
        Map<String,Integer> marks = new HashMap<>();
        marks.put("Ravi",100);
        marks.put("Kavi",200);
        marks.put("Shavi",300);
        marks.put(null,400);

        //hashing: hashCode() --> hashing

        System.out.println(marks.get("Kavi"));
        //hashCode of Ravi -- 121212
        //calculate index - 15
        //.equals to check the key name
        //Ravi
        //return value


    }
}
