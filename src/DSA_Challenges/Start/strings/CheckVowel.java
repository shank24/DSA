package DSA_Challenges.Start.strings;

public class CheckVowel {
    public static void main(String[] args) {
        String str = "aieppop";
        System.out.println(checkVowel(str));

    }

    private static boolean checkVowel(String str) {
        return str.toLowerCase().matches(".*[aieou].*");
    }
}
