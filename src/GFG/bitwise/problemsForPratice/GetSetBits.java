package bitwise.problemsForPratice;

import math_problems.problemsInSession.GetNumber;

public class GetSetBits {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(getFirstSetBits(n));
    }

    private static int getFirstSetBits(int n) {


        if(n==0){
            return 0;
        }
        return (int)(Math.log(((n^(n-1))+1))/Math.log(2));
    }
}
