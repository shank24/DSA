package GFG.Recursion.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class GetSumOFDigits_Rec {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();


        System.out.println(getSumOfDigits(n));
    }

    private static int getSumOfDigits(int n) {
        if(n==0)
            return 0;

        if(n<10 && n>0)
            return n;

        return (getSumOfDigits(n/10)+n%10);
    }


}
