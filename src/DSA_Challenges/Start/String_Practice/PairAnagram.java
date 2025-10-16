package DSA_Challenges.Start.String_Practice;

import java.util.HashMap;
import java.util.Map;

public class PairAnagram {
    public static void main(String[] args) {
        String s1 = "Mary";
        String s2 = "Army";
        checkAnagramStr(s1,s2);
    }

    private static void checkAnagramStr(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();

        for (Character ch : s1.toLowerCase().toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for (Character ch : s2.toLowerCase().toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)-1);
        }

        boolean flag= true;
        for (var pair: map.entrySet()){
            if(pair.getValue()!=0)
                flag=false;
        }
        System.out.println(flag);
    }
}
