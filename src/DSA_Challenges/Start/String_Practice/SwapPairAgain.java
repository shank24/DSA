package DSA_Challenges.Start.String_Practice;

import java.util.Arrays;

public class SwapPairAgain {
    public static void main(String[] args) {
        String str = "Javb";
        swapAgain(str);
    }

    private static void swapAgain(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i = i + 2) {
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }
        System.out.println(Arrays.toString(ch));
    }
}
