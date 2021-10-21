package GFG.Analysis_of_algorithm.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Fibbonaci_Number {

    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        int result = recursiveWay(n);
        System.out.println(result);
        iterativeWay(n);
    }

    private static void iterativeWay(int n) {
    }

    private static int recursiveWay(int n) {
        if(n==0 || n==1)
            return n;
        return recursiveWay(n-1)+recursiveWay(n-2);
    }
}
