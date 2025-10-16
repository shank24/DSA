package DSA_Challenges.Start.StringsAgain;

import DSA_Challenges.Start.strings.String_Reverse;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        usingTraditionalApproach(str);
        usingStringBuilder(str);
        usingStringBuilderAppend(str);
        usingStream(str);
        usingStack(str);
    }

    private static void usingStack(String str) {

        char[] reverseChar = new char[str.length()];

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <str.length() ; i++) {
            stack.push(str.charAt(i));
        }

        int index=0;
        while(!stack.isEmpty()){
            reverseChar[index++]=stack.pop();
        }
        System.out.println(new String(reverseChar));
    }

    private static void usingStream(String str) {
        System.out.println(Stream
                .of(str)
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" ")));

    }

    private static void usingStringBuilderAppend(String str) {
        if (str.isEmpty()) return;

        StringBuilder strb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            strb.append(str.charAt(i));
        }
        System.out.println(strb);
    }

    private static void usingStringBuilder(String str) {
        if (str.isEmpty()) return;

        StringBuilder stb = new StringBuilder(str);
        System.out.println(stb.reverse());

    }

    private static void usingTraditionalApproach(String str) {
        if (str.isEmpty()) return;

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }


}
