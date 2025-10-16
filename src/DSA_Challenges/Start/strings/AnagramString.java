package DSA_Challenges.Start.strings;

public class  AnagramString {
    public static void main(String[] args) {
        // Given string str
        String str = "Abcdefghijklmnopqrstuvwxyz";

        // Function call
        allLetter(str);
    }

    private static void allLetter(String str) {
        boolean flag = true;
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                flag = false;
                break;
            }
        }

        // Check if all letter present then
        // print "Yes", else print "No"
        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
