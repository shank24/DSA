package GFG_Practice.Maths_Algo;

import GFG.util.GetLongNumber;

public class Automorphic_Number {
    public static void main(String[] args) {
        long n = GetLongNumber.getLongNumber();

        System.out.println(automorphic_Number(n));
    }

    public static boolean automorphic_Number(long n){

    long squareRoot = (long) Math.pow(n,2);

    if(squareRoot/n==n)
        return true;
    else
        return false;
    }
}
