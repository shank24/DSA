package DSA_Challenges.Start.StringsAgain;

public class GetSpecificCharatIndex {
    public static void main(String[] args) {
        String str = "Java is Good";
        int index = 2;
        getSpecificIndex(str, index);
        getSpecificIndexUsingCharArray(str, index);
    }

    private static void getSpecificIndex(String str, int index) {
        if(str.isEmpty())
            return;

        char ch = str.charAt(index);
        System.out.println(ch);
    }

    private static void getSpecificIndexUsingCharArray(String str, int index) {
        if(str.isEmpty())
            return;

        char ch = str.toCharArray()[index];
        System.out.println(ch);
    }
}
