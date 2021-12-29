package GFG.Recursion.problemsInSession;

import GFG.util.GetNumber;

public class PrintNumberUsingRecursion {

    public static void main(String[] args) {

        int n = GetNumber.getNumber();


        oneToN(n);
        //nToOne(n);
        //oneToNTailRecursive(n,1);
    }

    // Non Tail Recursive Function
    // Here it is storing the state
    // and then printing
    static void oneToN(int n){
        if (n==0)
            return;

        oneToN(n-1);
        System.out.println(n);
    }



    static void oneToNTailRecursive(int n, int k){

        if (n==0)
            return;

        System.out.println(k);
        oneToNTailRecursive(n-1,k+1);
    }


    // Tail Recursive Function
    // Here it is not storing any call
    // after child call's
    static void nToOne(int n){
        if (n==0)
            return;

        System.out.println(n);
        nToOne(n-1);
    }
}
