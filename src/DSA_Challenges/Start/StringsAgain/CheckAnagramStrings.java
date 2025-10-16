package DSA_Challenges.Start.StringsAgain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckAnagramStrings {
    public static void main(String[] args) {
        String str1 = "Army";
        String str2 = "Mary";

        checkAnagram(str1, str2);
    }

    private static void checkAnagram(String str1, String str2) {
        if (str1.isEmpty())
            return;

        Map<Character, Integer> charMap = new HashMap<>();
        //Incrementing value
        for (char ch :
                str1.toLowerCase().toCharArray())
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);

        //Decrementing value
        for (char ch :
                str2.toLowerCase().toCharArray())
            charMap.put(ch, charMap.getOrDefault(ch, 0) - 1);

        boolean res = true;
        //charMap value should be 0 - for Anagram string
        for (var pair : charMap.entrySet()) {
            if (pair.getValue() != 0) {
                res = false;
                break;
            }
        }
        if(res)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }

}
