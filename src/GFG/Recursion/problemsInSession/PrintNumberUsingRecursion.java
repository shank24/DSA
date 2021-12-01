package GFG.Recursion.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class PrintNumberUsingRecursion {

    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        oneToN(n);
        nToOne(n);
    }

    static void oneToN(int n){
        if (n==0)
            return;

        oneToN(n-1);
        System.out.println(n);
    }

    static void nToOne(int n){
        if (n==0)
            return;

        System.out.println(n);
        nToOne(n-1);
    }
}
