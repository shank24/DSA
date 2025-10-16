package DSA_Challenges.Start.StringsAgain;

public class SwapPair {
    public static void main(String[] args) {
        String str = "Java";
        swapPairOfChars(str);
    }

    private static void swapPairOfChars(String str) {
        if (str.isEmpty())
            return; 

        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i = i + 2) {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }

        System.out.println(new String(ch));

    }
}
