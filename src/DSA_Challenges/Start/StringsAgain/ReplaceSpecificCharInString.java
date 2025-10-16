package DSA_Challenges.Start.StringsAgain;

public class ReplaceSpecificCharInString {
    public static void main(String[] args) {
        String str = "Geeks Gor Geeks";
        char ch = 'F';
        int index = 6;
        replaceChar(str, ch, index);
        replaceCharViaStringBuilder(str, ch, index);
        replaceCharViaStringBuffer(str, ch, index);
    }

    private static void replaceCharViaStringBuilder(String str, char ch, int index) {
        StringBuilder strb = new StringBuilder(str);
        strb.setCharAt(index, ch);
        System.out.println(strb);
    }

    private static void replaceCharViaStringBuffer(String str, char ch, int index) {
        StringBuffer strb = new StringBuffer(str);
        strb.setCharAt(index, ch);
        System.out.println(strb);
    }

    private static void replaceChar(String str, char ch, int index) {
        System.out.println(str.substring(0, index) + ch + str.substring(index + 1));
    }


}
