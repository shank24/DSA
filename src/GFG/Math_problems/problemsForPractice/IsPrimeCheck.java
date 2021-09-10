package GFG.Math_problems.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class IsPrimeCheck {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(isPrime(n));

    }

    private static boolean isPrime(int n) {
        boolean res=true;

        if(n==1)
            res=false;

        for (int i = 2; i<=Math.sqrt(n) ; i++) {
            if(n%i==0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
