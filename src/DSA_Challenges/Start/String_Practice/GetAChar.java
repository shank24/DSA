package DSA_Challenges.Start.String_Practice;

import java.util.Arrays;

public class GetAChar {
    public static void main(String[] args) {
        String str = "My Country Is India";
        int index = 6;
        char ch = 'N';

        getAChar(str, index);
        replaceAChar(str, index, ch);
        //System.out.println("Reversing Char By Char");
        reverseAString(str);
        reverseAString1(str);
        //System.out.println("Reversing Order of Word");
        reverseWord(str);
        reverseWordAgain(str);
        String newStr = "werpoibca";
        sortString(newStr);


    }

    private static void sortString(String str) {
        char temp = ' ';
        char[] ch1 = str.toCharArray();
        for (int i = 0; i < str.length() ; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ch1[i] > ch1[j]) {
                    temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ch1));

    }

    private static void reverseWordAgain(String str) {
        String[] str1 = str.split(" ");
        System.out.println();
        for (int i = str1.length - 1; i >= 0; i--) {
            String eachStr = str1[i];
            for (int j = eachStr.length() - 1; j >= 0; j--) {
                System.out.print(eachStr.charAt(j));
            }
            System.out.print(" ");
        }
    }

    private static void reverseWord(String str) {
        String[] str1 = str.split(" ");
        System.out.println();
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i] + " ");
        }

    }

    private static void reverseAString1(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    private static void reverseAString(String str) {
        if (str.isEmpty())
            return;

        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());
    }

    private static void replaceAChar(String str, int index, char ch) {
        if (str.isEmpty())
            return;

        String s = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println(s);
    }

    private static void getAChar(String str, int index) {
        if (str.isEmpty())
            return;

        char ch = str.charAt(index);
        System.out.println(ch);
    }
}
