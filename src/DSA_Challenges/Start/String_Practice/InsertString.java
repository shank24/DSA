package DSA_Challenges.Start.String_Practice;

public class InsertString {
    public static void main(String[] args) {
        String str = "GeeksGeeks";
        String insert = "For";
        int index = 4;

        insertStr(str,insert,index);
    }

    private static void insertStr(String str, String insert, int index) {
        String s = str.substring(0, index) + insert + str.substring(index + 1);
        System.out.println(s);
    }
}
