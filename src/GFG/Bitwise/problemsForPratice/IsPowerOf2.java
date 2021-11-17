package GFG.Bitwise.problemsForPratice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class IsPowerOf2 {

    public static void main(String[] args) {

        int a = GetNumber.getNumber();
        System.out.println(isPowerofTwoSimpleWay(a));

    }

    /*public static boolean isPowerofTwo(long n){

        if(n==0)
            return false;

        return (!(n & (n - 1)));

    }*/

    /*
    A number which is power of 2 will only have 1
    set bit except 0 which is the base case.
    So by changing the rightmost set bit to unset bit
    n&(n-1)we see if it is equal to 0.
    If yes then return true else false.
     */


    public static boolean isPowerofTwoSimpleWay(long n){
        // Your code here
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}
