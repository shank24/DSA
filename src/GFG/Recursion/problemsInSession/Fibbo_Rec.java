package GFG.Recursion.problemsInSession;

import GFG.util.GetNumber;

public class Fibbo_Rec {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(fibbo(n));
    }

    private static int fibbo(int n) {

        if(n<=1){
            return n;
        }

        return fibbo(n-1) + fibbo(n-2);
    }


}
