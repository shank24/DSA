package analysis_of_algorithm.problemsForPractice;

import math_problems.problemsInSession.GetNumber;

public class FindSumOFNaturalNumbers {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        System.out.println(recursiveWay(n));
        System.out.println(ArithmeticWay(n));

    }

    private static int ArithmeticWay(int n) {
        return n*(n+1)/2;
    }

    private static int recursiveWay(int n) {
        if(n==0)
            return 0;
        else
            return n + recursiveWay(n-1);
    }
}
