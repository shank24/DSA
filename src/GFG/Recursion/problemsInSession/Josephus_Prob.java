package GFG.Recursion.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Josephus_Prob {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();
        int k = GetNumber.getNumber();

        System.out.println(jos(n, k));

    }

    private static int jos(int n, int k) {
        if(n==1)
            return 0;

        else
            return (jos(n-1,k)+k)%n;

    }
}
