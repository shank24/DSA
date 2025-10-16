package DSA_Challenges.Start.strings;

public class FindOccurenceOfACharInString {

    public static void main(String[] args) {
        String str = "AMERICA";
        char ch = 'a';
        findOccurence(str,ch);
        usingJava8(str,ch);

    }

    private static void findOccurence(String str,char ch) {
        if(str.isEmpty())
            return;

        int count = 0;

        str=str.toLowerCase();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void usingJava8(String str, char ch){
        long count = str.toLowerCase().chars().filter(c -> c == ch ).count();
        System.out.println(count);
    }
}
