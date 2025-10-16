package DSA_Challenges.Start.strings;

public class OddLengthString {
    public static void main(String[] args) {
        String str = "i am Geeks for Geeks and a Geek";

        getOddLengthWords(str);
    }

    private static void getOddLengthWords(String str) {
        String [] newString = str.split(" ");

        for (String s: newString){
            if(s.length()%2!=0){
                System.out.println(s);
            }
        }
    }
}
