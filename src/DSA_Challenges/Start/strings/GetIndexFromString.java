package DSA_Challenges.Start.strings;

public class GetIndexFromString {
    public static void main(String[] args) {
        String str = "Trentino";
        int index = 2;
        getIndexOfStr(str, index);
        getIndexOfStrCharAt(str, index);

    }

    private static void getIndexOfStr(String str, int index) {
        System.out.println(str.toCharArray()[index]);
    }

    private static void getIndexOfStrCharAt(String str, int index) {
        char ch = str.charAt(index);
        System.out.println(ch);
    }
}
