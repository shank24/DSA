package GFG.Bitwise.problemsForPratice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class CheckKthbitSet {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();
        int k = GetNumber.getNumber();

        System.out.println(checkKthBitIsSet(n,k));
        System.out.println(findKthBitIsSet(n,k));
}
    // Using Right Shift
    private static boolean checkKthBitIsSet(int n, int k)
    {
        return ( ((n>>k) & 1)==1);
    }

    //Using Left Shift
    private static boolean findKthBitIsSet(int n, int k)
    {
        return ((n & (1 << (k) ))!=0);
    }


}
