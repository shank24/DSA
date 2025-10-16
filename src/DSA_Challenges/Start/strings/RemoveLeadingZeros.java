package DSA_Challenges.Start.strings;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String str = "00000123569";

        removeLeadingZeros(str);
    }

    private static void removeLeadingZeros(String str) {
        System.out.println(str.replace("0",""));

    }
}
