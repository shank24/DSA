package GFG.Math_problems.problemsForPractice;

import GFG.util.GetNumber;

public class FindGPTerm {

    public static void main(String[] args) {

        int a = GetNumber.getNumber();
        int b = GetNumber.getNumber();
        int n = GetNumber.getNumber();

        System.out.println(findGPTerm(a,b,n));

    }

    private static double findGPTerm(int a, int b, int n) {

        return Math.floor(a*(Math.pow((double)b/(double)a,n-1)));
    }
}
