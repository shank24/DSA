package GFG.Recursion.problemsInSession;

import java.util.Scanner;

public class Generate_Subsets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scanner.nextLine();

        printSub(str, "", 0);

    }

    private static void printSub(String str, String curr, int index) {

        if(index== str.length()){
            System.out.println(curr+" ");
            return;
        }

        printSub(str, curr, index + 1);
        printSub(str, curr+str.charAt(index), index + 1);
    }
}
