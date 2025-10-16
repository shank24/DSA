package DSA_Challenges.Start.basic;

import java.util.Scanner;

public class PrimeNumber {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkPrime(number);


    }

    private static void checkPrime(int number) {

        if (number == 0)
            return;

        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                flag = false;
        }

        if(flag)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
