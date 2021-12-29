package GFG.Recursion.problemsInSession;

import GFG.util.GetNumber;

public class Josephus_Prob {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();
        int k = GetNumber.getNumber();

        System.out.println(jos(n, k));
        System.out.println(josephus(n, k));
    }

    private static int jos(int n, int k) {
        if(n==1)
            return 0;

        else
            return (jos(n-1,k)+k)%n;

    }

    public static int josephus(int n, int k)
    {
        return mj(n , k)+1;
    }

    public static int mj(int n , int k)
    {

        return n==1?0:(josephus(n-1 , k)+k-1)%n;

    }
}
