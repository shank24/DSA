package DSA_Challenges.Start.strings;

import java.util.Arrays;
import java.util.Comparator;

public class SortString {
    public static void main(String[] args) {

        String str = "XZYPOMLKDERBSSA";
        sortStringUsingArrays(str);
        sortWithoutBuiltInFunction(str);
    }

    private static void sortWithoutBuiltInFunction(String str) {

        Character[] ch = new Character[str.length()];

        for (int i = 0; i <str.length() ; i++) {
            ch[i] = str.charAt(i);
        }

        //Without Lambda
        /*
         Arrays.sort(ch, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.compare(
                        Character.toLowerCase(o1),
                        Character.toLowerCase(o2));
            }
        });

         */
        Arrays.sort(ch, (o1, o2) -> Character.compare(
                Character.toLowerCase(o1),
                Character.toLowerCase(o2)));

        StringBuilder sb = new StringBuilder(ch.length);
        for (Character c: ch){
            sb.append(c.charValue());
        }
        System.out.println(sb);
    }



    private static void sortStringUsingArrays(String str) {
        if(str.isEmpty())
            return;

        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        System.out.println(ch);
    }
}
