package GFG.Recursion.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Recursion_Riddles {

    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        //fun(n);
        fun1(n);
    }

    static void fun(int n){
        if(n==0)
            return;

        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }

    static void fun1(int n){
        if(n==0)
            return;

        fun1(n-1);
        System.out.println(n);
        fun1(n-1);
    }




}
