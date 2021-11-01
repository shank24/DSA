package GFG.Bitwise.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Bitwise_Demo {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        int shiftRange = GetNumber.getNumber();

        //System.out.println(getBitwiseNot(n));
        //System.out.println(getLeftShift(n,shiftRange));
        System.out.println(getRightShift(n,shiftRange));
    }

    private static int getLeftShift(int n, int shiftRange) {

        return (n<<shiftRange);
    }

    private static int getRightShift(int n, int shiftRange) {

        return (n>>shiftRange);
    }

    private static int getBitwiseNot(int n) {
        return (~n);
    }
}
