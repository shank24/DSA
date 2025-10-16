package DSA_Challenges.Start.strings;

public class EvenLengthString {
    public static void main(String[] args) {
        String str = "i am Geeks for Geeks and a Geek";

        getEvenLengthWords(str);
    }

    private static void getEvenLengthWords(String str) {
        String [] newString = str.split(" ");

        for (String s: newString){
            if(s.length()%2==0){
                System.out.println(s);
            }
        }
    }
}
