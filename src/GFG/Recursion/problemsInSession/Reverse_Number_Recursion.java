package GFG.Recursion.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Reverse_Number_Recursion {

    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        getReverseNumberRecursiveWay(n);
    }

    private static void getReverseNumberRecursiveWay(int n) {

        if(n<10){
            System.out.println(n);
            return;
        }

        else{
            System.out.print(n%10);
            getReverseNumberRecursiveWay(n/10);
        }

    }
}
