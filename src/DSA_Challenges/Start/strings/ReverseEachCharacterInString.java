package DSA_Challenges.Start.strings;

public class ReverseEachCharacterInString {
    public static void main(String[] args) {

        String sentence = "We should be kind to all people";

        splitIntoArrayOfStrings(sentence);

    }

    private static void splitIntoArrayOfStrings(String sentence) {
        if(sentence.isEmpty())
            return;

        String str[] = sentence.split(" ");
        reverseEachWord(str);
        reverseEachWord1(str);


    }

    private static void reverseEachWord(String[] str) {
        StringBuilder revStr = new StringBuilder();

        for (int i = str.length-1; i>=0 ; i--) {
            String eachStr = str[i];
            for (int j = eachStr.length()-1; j >=0 ; j--) {
                revStr.append(eachStr.charAt(j));
            }
            revStr.append(" ");
        }
        System.out.println(revStr);
    }

    private static void reverseEachWord1(String[] str) {
        //String[] revStr = new String[str.length];

        for (int i = str.length-1; i>=0 ; i--) {
            String eachStr = str[i];
            for (int j = eachStr.length()-1; j >=0 ; j--) {
                System.out.print(eachStr.charAt(j));
                //revStr[i] = String.valueOf(eachStr.charAt(j));
            }
            System.out.print(" ");
        }
        //System.out.println(Arrays.toString(revStr));
    }
}
