package GFG.Bitwise.problemsForPratice;

import GFG.util.GetNumber;

public class IsParse {
    public static void main(String[] args) {


        int a = GetNumber.getNumber();
        System.out.println(isSparse(a));
    }

    public static boolean isSparse(int n)
    {
            return ((n&(n>>1))==0);
    }
}
