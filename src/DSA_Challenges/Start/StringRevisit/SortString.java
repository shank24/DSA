package DSA_Challenges.Start.StringRevisit;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "XZYPOMLKDERBSSA";
        sortUsingBuiltIn1(str);
    }

    private static void sortUsingBuiltIn1(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

    }
}
