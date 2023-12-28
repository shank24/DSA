package DSA_Challenges.Start;

import GFG.util.GetString;

public class String_Reverse {
    public static void main(String[] args) {
        String str = GetString.getString();
        reverse(str);
    }

    public static void reverse(String str) {
        for (int i = str.length()-1; i >=0 ; i--) System.out.print(str.charAt(i));
    }
}
