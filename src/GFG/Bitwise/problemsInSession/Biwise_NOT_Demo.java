package GFG.Bitwise.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Biwise_NOT_Demo {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        System.out.println(getBitwiseNot(n));
    }

    private static int getBitwiseNot(int n) {
        return (~n);
    }
}
