package DSA_Challenges.Start.strings;

public class SwapPair {
    public static void main(String[] args) {
        String str = "JaVaPa";
        swapPair(str);
    }

    private static void swapPair(String str) {
        
        if(str.isEmpty())
            return;
        
        char[] ch = str.toCharArray();

        for (int i = 0; i <ch.length-1 ; i=i+2) {
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
        }
        System.out.println(ch);
    }
}
