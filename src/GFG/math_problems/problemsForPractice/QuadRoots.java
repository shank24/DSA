package math_problems.problemsForPractice;

import math_problems.problemsInSession.GetNumber;

public class QuadRoots {
    public static void main(String[] args) {

        int a = GetNumber.getNumber();
        int b = GetNumber.getNumber();
        int c = GetNumber.getNumber();

        findRoots(a,b,c);

    }

    private static void findRoots(int a, int b, int c) {

        if (a == 0) {
            System.out.println("Invalid");
            return;
        }

        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));

        if (d > 0) {
            System.out.println(
                    "Roots are real and different \n");

            System.out.println(
                    (double)(-b + sqrt_val) / (2 * a) + "\n"
                            + (double)(-b - sqrt_val) / (2 * a));
        }
        else if (d == 0) {
            System.out.println(
                    "Roots are real and same \n");

            System.out.println(-(double)b / (2 * a) + "\n"
                    + -(double)b / (2 * a));
        }
        else // d < 0
        {
            System.out.println("Roots are complex \n");

            System.out.println(-(double)b / (2 * a) + " + i"
                    + sqrt_val + "\n"
                    + -(double)b / (2 * a)
                    + " - i" + sqrt_val);
        }
    }
}
