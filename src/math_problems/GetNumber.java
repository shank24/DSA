package math_problems;

import java.util.Scanner;

public class GetNumber {

     public static int getNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        return scanner.nextInt();
    }
}
