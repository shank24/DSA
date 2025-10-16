package DSA_Challenges.Start.strings;

import java.util.Arrays;
import java.util.HashMap;

public class CheckAnagramStrings {
    public static void main(String[] args) {
        String s1 = "Mary";
        String s2 = "Army";

        checkAnagram(s1, s2);
        System.out.println(checkAnagramViaMap(s1, s2));

    }

    private static boolean checkAnagramViaMap(String s1, String s2) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        // Count frequency of each character in string s1
        for (char ch : s1.toLowerCase().toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

        // Count frequency of each character in string s2
        for (char ch : s2.toLowerCase().toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);

        //Check if frequencies are zero
        for (var pair : charCount.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }
        return true;

    }

    private static void checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return;

        char[] ch1 = s1.toLowerCase().toCharArray();
        char[] ch2 = s2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1, ch2));
    }
}
