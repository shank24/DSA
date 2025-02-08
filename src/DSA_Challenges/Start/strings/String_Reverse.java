package DSA_Challenges.Start.strings;

import GFG.util.GetString;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class String_Reverse {
    public static void main(String[] args) {
        String str = GetString.getString();
        reverse(str);
        System.out.println(reverseBuilder(str));
        System.out.println(reverseViaStream(str));
    }

    public static void reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static String reverseBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String reverseViaStream(String str) {
        return Stream.of(str).
                map(word -> new StringBuilder(word).reverse()).
                collect(Collectors.joining(" "));
    }
}
