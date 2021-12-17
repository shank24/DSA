package GFG.Recursion.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Power_Of_Numbers {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();
        int r = GetNumber.getNumber();


        System.out.println(power(n,r));
    }

    private static long power(int n,int r){
     long res = getPowerRecWay(n,r);
     return (res%1000000007);
    }

    private static int getPowerRecWay(int n, int power) {
        if(power!=0)
            return (n * getPowerRecWay(n,power-1));
        else
            return 1;

    }
}
