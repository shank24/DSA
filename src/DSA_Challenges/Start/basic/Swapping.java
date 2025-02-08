package DSA_Challenges.Start.basic;

import java.util.Scanner;

public class Swapping {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        swapNumber(a,b);
    }

    private static void swapNumber(int a, int b){
        if (a > b) {
            a = a - b;
            b = a + b;
            a = b - a;
        }
        else{
            b = b - a;
            a = a + b;
            b = a - b;
        }
        System.out.println("a is now " + a);
        System.out.println("b is now " + b);


    }
}
