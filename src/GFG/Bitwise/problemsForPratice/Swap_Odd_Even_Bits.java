package GFG.Bitwise.problemsForPratice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Swap_Odd_Even_Bits {

    public static void main(String[] args) {

        int a = GetNumber.getNumber();
        System.out.println(swapBits(a));
    }

    //Function to swap odd and even bits.

    public static int swapBits(int n)
    {
        //extract odd bit only (0101 0101)
        int odd_Mask  =  0x55555555;

        //extract even bit only (1010 1010)
        int even_Mask =  0xAAAAAAAA;


        int odds = (n & odd_Mask);

        int even = (n & even_Mask);

        even >>=1;
        odds <<=1;

        return (even^odds);

    }
}
