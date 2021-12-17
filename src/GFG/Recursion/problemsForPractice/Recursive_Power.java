package GFG.Recursion.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Recursive_Power {

    public static void main(String[] args) {
        int n = GetNumber.getNumber();
        int power = GetNumber.getNumber();

        //System.out.println(recursivePower(n, power));
        System.out.println(getPowerRecWay(n, power));
    }

    private static int getPowerRecWay(int n, int power) {
        if(power!=0)
            return (n * getPowerRecWay(n,power-1));
        else
            return 1;

    }

    private static int recursivePower(int n, int p) {

        if(p==0)
            return 1;

        int i=1;
        while (p!=0){
            i=i*n;
            p=p-1;
        }

        return i;
    }
}
