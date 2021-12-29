package GFG.Recursion.problemsInSession;

import GFG.util.GetNumber;

public class Fact_Using_Tail_Recursion {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        System.out.println(fact(n));


        System.out.println(factTailRec(n,1));
    }

    //Non Tail Rec Way
    private static int fact(int n) {

        if(n==0 || n==1)
            return 1;

        return n*fact(n-1);
    }

    //Tail Rec Way
    private static int factTailRec(int n,int k) {

        if(n==0 || n==1)
            return k;

        return factTailRec(n-1,n*k);
    }


}
