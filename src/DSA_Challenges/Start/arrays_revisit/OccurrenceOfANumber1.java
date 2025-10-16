package DSA_Challenges.Start.arrays_revisit;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfANumber1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,4,5,6,6};

        findOccurrence1(arr);
    }

    private static void findOccurrence1(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        map.forEach((k,v) -> System.out.println("Key " + k + "Val " + v));
    }
}
