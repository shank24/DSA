package GFG.Math_problems.problemsForPractice;

import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T>0){
            int num = sc.nextInt();
            System.out.println(cToF(num));
            T--;
        }
    }

    private static int cToF(int num) {
        return (int) (num*(1.8)+32);
    }

}
