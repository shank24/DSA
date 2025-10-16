package DSA_Challenges.Start.ArraysAgain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,3,4,5,2};
        findOccurrenceOfNum(arr);

    }

    private static void findOccurrenceOfNum(int[] arr) {
        if(arr.length<=1)
            return;
        Map<Integer,Integer> map = new HashMap<>();

        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()){
            int key = it.next();
            int val = map.get(key);
            System.out.println("K : " + key + " V : " + val);
        }

        map.forEach((k,v) -> System.out.println("Key : " +k + " Val :" +v ));

        for (var entry : map.entrySet() ){
            System.out.println(entry.getKey() + entry.getValue());
        }

    }
}
