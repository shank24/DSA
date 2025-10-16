package DSA_Challenges.Start.StringsAgain;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String s = "GeeksForGeeks";

        sortUsingArray(s);
        sortBubble(s);
    }

    private static void sortUsingArray(String s) {
        if (s.isEmpty())
            return;

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }

    private static void sortBubble(String s) {
        char ch = ' ';
        char[] ch1 = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (ch1[i] > ch1[j]) {
                    ch = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = ch;
                }
            }
        }

        System.out.println(new String(ch1));
    }
}
