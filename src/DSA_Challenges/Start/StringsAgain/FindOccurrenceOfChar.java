package DSA_Challenges.Start.StringsAgain;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrenceOfChar {
    public static void main(String[] args) {
        String str = "Java";
        findOccurence(str);
    }

    private static void findOccurence(String str){
        if(str.isEmpty())
            return;

        Map<Character,Integer> charMap = new HashMap<>();

        for (Character ch: str.toLowerCase().toCharArray()){
            charMap.put(ch,charMap.getOrDefault(ch,0)+1);
        }

        charMap.forEach((k,v) -> System.out.println( k + " Occurs -> " + v + " Times"));
    }
}
