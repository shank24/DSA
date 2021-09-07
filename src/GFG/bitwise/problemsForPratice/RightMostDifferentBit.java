package bitwise.problemsForPratice;

import math_problems.problemsInSession.GetNumber;

public class RightMostDifferentBit {
    public static void main(String[] args) {

        int m = GetNumber.getNumber();
        int n = GetNumber.getNumber();

        System.out.println(posOfRightMostDiffBit(m,n));
        System.out.println(otherSolu(m,n));

    }

    private static int otherSolu(int m, int n) {

        if(m==n)
            return -1;

        int value = m ^ n ;
        int mask = 1 ;
        int counter = 1 ;
        while(value >0)
        {
            if((value & mask) == 1)
            {
                return counter ;
            }
            counter++;
            value = value/2 ;
        }
        return counter ;

    }

    private static int posOfRightMostDiffBit(int m, int n) {

        if(m==n)
            return -1;
        int a = m^n;
        int b = (m^n)-1;
        int c = a+b+1;
        return (int)(Math.log(c)/Math.log(2));

    }
}
