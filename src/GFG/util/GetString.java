package GFG.util;

import java.util.Scanner;

public class GetString {

     public static String getString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String: ");
        return scanner.nextLine();
    }
}
