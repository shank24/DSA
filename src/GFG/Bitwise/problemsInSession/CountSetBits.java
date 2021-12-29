
package GFG.Bitwise.problemsInSession;

import GFG.util.GetNumber;

// Time Complexity - It takes time equal to Binary rep of n, 32 bits / 64 bits.

// TC - Theta(Total Bits in n).

// TC - Brian - Total Number of Set Bits - 5 has 2 - 000..00...101.

public class CountSetBits {

    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        // Naive Solution
        //System.out.println(countSetBits(n));
        //System.out.println(usingShiftOperator(n));

        //Brian Kernigam's Algo
        // Turning off the Last Set Bit
        System.out.println(brianK1Algo(n));

    }

    // Brain Kerningam's Algo
    private static int brianK1Algo(int n) {
        if(n==1)
            return 1;

        int count =0;

        while (n!=0){
            n=(n & (n-1));
                count++;
            }
        return count;
    }


    private static int usingShiftOperator(int n) {
        if(n==1)
            return 1;

        int count =0;

        while (n!=0){
            if((n & 1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    private static int countSetBits(int n) {

        if(n==1)
            return 1;

        int count =0;

        while (n!=0){
            if(n%2!=0){
                count++;
            }
            n/=2;
        }
        return count;
    }
}

