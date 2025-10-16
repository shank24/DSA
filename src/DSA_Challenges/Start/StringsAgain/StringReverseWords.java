package DSA_Challenges.Start.StringsAgain;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverseWords {
    public static void main(String[] args) {
        String str = "Java is good";
        usingTraditionalApproach(str);
    }


    private static void usingTraditionalApproach(String str) {
        if (str.isEmpty()) return;

        String[] strArray = str.split(" ");

        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i] + " ");
        }
    }


}
