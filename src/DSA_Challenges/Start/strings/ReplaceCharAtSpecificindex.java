package DSA_Challenges.Start.strings;

public class ReplaceCharAtSpecificindex {
    public static void main(String[] args) {
        String str = "Trentino";
        int index = 4;
        char ch = 'm';
        replaceChar(str,index,ch);
        replaceCharWithStringBuilder(str,index,ch);
    }

    private static void replaceChar(String str, int index, char ch) {
        if (str.isEmpty())
            return;
        System.out.println(str.substring(0,index)+ ch + str.substring(index+1));
    }

    private static void replaceCharWithStringBuilder(String str, int index, char ch) {
        if (str.isEmpty())
            return;
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index,ch);
        System.out.println(sb);
    }
}
