package DSA_Challenges.Start.strings;

public class ReverseWordsInString {
    public static void main(String[] args) {

        String sentence = "We should be kind to all people";

        reverseWords(sentence);

    }

    private static void reverseWords(String sentence) {
        if(sentence.isEmpty())
            return;

        String str[] = sentence.split(" ");

        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str[i] + " ");
        }
    }
}
