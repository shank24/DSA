package DSA_Challenges.Start.String_Practice;

public class AnagramCheck {
    public static void main(String[] args) {
        String str = "Abcdefghijklmnopqrstuvwxyz";
        isAnagram(str);

    }

    private static void isAnagram(String str) {
        boolean flag = true;
        str = str.toLowerCase();
        for (char ch = 'a'; ch <='z'; ch++) {
            if(!str.contains(String.valueOf(ch))){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("anagram");
        else
            System.out.println("not");
    }
}
