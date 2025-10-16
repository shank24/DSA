package DSA_Challenges.Start.StringRevisit;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        boolean status = checkAnagram1(str1,str2);
        System.out.println(status);

    }

    private static boolean checkAnagram1(String str1, String str2) {

        if(str1.length()!=str2.length()) return false;

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }
}
