package GFG.Bitwise.problemsForPratice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class GetSetBits {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        //System.out.println(getFirstSetBits(n));

        System.out.println(getFirstSetBitsOtherWay(n));
    }

    private static int getFirstSetBits(int n) {


        if(n==0){
            return 0;
        }
        return (int)(Math.log(((n^(n-1))+1))/Math.log(2));
    }

    private static int getFirstSetBitsOtherWay(int n) {

        int res=0,count=1;

        if(n==0){
            return 0;
        }

        while (n!=0){
            if((n & 1) ==1){
                res=count;
                break;
            }
            count++;
            n=n/2;
        }
        return count;
    }

}
