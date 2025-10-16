package DSA_Challenges.Start.StringRevisit;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Popeye";
        String sentence = "Tough Times create string men";
        getReverse(str);
        getReverseSent(sentence);
        getReverseSentWithWords(sentence);
    }

    private static void getReverseSent(String sentence) {

        String str[] = sentence.split(" ");

        for (int i = str.length-1; i >=0 ; i--) {
            System.out.print(str[i] + " ");
        }
    }

    private static void getReverseSentWithWords(String sentence) {

        String str[] = sentence.split(" ");
        System.out.println();
        for (int i = str.length-1; i >=0 ; i--) {
            //System.out.print(str[i] + " ");
            String newStr = str[i];
            getReverse(newStr);
        }
    }

    private static void getReverse(String str) {

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }


    }
}
