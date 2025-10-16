package DSA_Challenges.Start.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurenceOfAEachCharInString {

    public static void main(String[] args) {
        String str = "CANADA";
        findOccurence(str);
        usingJava8(str);
        usingMap(str);
    }

    private static void findOccurence(String str) {
        if(str.isEmpty())
            return;

        str=str.toLowerCase();

        int[] counter = new int[256];

        for(char c: str.toCharArray()){
            counter[c]++;
        }

        System.out.println("Using Naive Approach");

        for (int i = 0; i <counter.length ; i++) {
            if(counter[i]>0){
                System.out.print((char)(i) +  " = " + counter[i] + ",");
            }
        }
        System.out.println();

    }

    private static void usingJava8(String str){
        Map<Character, Long> countMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println("Character Occurrences: Java 8");
        countMap.forEach((k, v) -> System.out.print(k + " : " + v));
        System.out.println();
    }

    private static void usingMap(String str){

        Map<Character,Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println("Character Occurrences : Map");

        map.forEach((k, v) -> System.out.print(k + " : " + v));

        /*for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " =  " + entry.getValue());
        }*/
    }
}
