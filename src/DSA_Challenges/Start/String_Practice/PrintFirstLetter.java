package DSA_Challenges.Start.String_Practice;

public class PrintFirstLetter {
    public static void main(String[] args) {
        String str = "Teeks For Yeeks Pop";
        printFirstLetter(str);
    }

    private static void printFirstLetter(String str) {
        String[] newStr = str.split(" ");

        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i].charAt(0));
        }
    }
}
