package GFG.util;

import java.util.Scanner;

public class GetLongNumber {

     public static long getLongNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        return scanner.nextLong();
    }
}
