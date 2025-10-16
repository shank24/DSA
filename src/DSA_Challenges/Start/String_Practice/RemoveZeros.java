package DSA_Challenges.Start.String_Practice;

public class RemoveZeros {
    public static void main(String[] args) {
        String str = "00000123569";
        removeZero(str);
    }

    private static void removeZero(String str) {
        str = str.replace("0","");
        System.out.println(str);
    }
}
