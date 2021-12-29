package GFG.Recursion.problemsInSession;

import GFG.util.GetNumber;

public class GetSumOFNNaturalNumbers {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();


        System.out.println(getSum(n));
    }

    private static int getSum(int n) {
        if(n==0)
            return 0;

        return (n + getSum(n-1));
    }


}
