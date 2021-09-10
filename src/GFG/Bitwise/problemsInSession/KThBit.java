package GFG.Bitwise.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class  KThBit {

    public static void main(String[] args) {
        int n = GetNumber.getNumber();
        int k = GetNumber.getNumber();

        findKthBitIsSet(n,k);
        findKthBitIsSet1(n,k);

    }

    //Using Left Shift
    private static void findKthBitIsSet(int n, int k) {
        if((n & (1 << (k-1) ))!=0)
            System.out.println("SET");
        else
            System.out.println("Not SET");
    }

    //Using Right Shift
    private static void findKthBitIsSet1(int n, int k) {
        if(((n >> (k-1)) & 1 ) == 1)
            System.out.println("SET");
        else
            System.out.println("Not SET");
    }
}
