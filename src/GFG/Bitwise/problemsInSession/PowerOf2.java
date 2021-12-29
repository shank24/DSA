package GFG.Bitwise.problemsInSession;

import GFG.util.GetNumber;

public class PowerOf2 {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(isNumberPowerOf2(n));
        System.out.println(efficientWay(n));
        System.out.println(oneLineSoln(n));
    }

    private static boolean oneLineSoln(int n) {

        return (n!=0) & ((n & (n-1))==0);
    }

    private static boolean efficientWay(int n) {
        if(n==0)
            return false;
        else
            return ((n & (n-1))==0);
    }

    private static boolean isNumberPowerOf2(int n) {

        if(n==0)
            return false;
        while (n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}
