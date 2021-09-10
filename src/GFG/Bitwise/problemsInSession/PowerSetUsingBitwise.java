package GFG.Bitwise.problemsInSession;

//TC - Theta (2,pow(n) * n)

import java.util.Scanner;

public class PowerSetUsingBitwise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scanner.nextLine();

        printPowerSet(str);
    }

    private static void printPowerSet(String str) {

        int n = str.length();
        int powSize = (int)Math.pow(2,n);

        for (int i = 0; i <powSize ; i++) {
            for (int j = 0; j <n ; j++) {

                if((i & (1<<j))!=0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

    }

}
