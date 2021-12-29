package GFG.Recursion.problemsInSession;

import GFG.util.GetNumber;

public class Recursion_Riddles {

    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        //fun(n);
        //fun1(n);
        //System.out.println(fun2(n));
        //System.out.println(fun3(n));
        fun4(n);
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


    //Log(n - base 2)
    static int fun2(int n){
        if(n==1)
            return 0;
        else
            return 1 + fun2(n/2);
    }

    //Log (n - base 3)
    static int fun3(int n){
        if(n<3)
            return 0;
        else
            return 1 + fun3(n/3);
    }

    //Binary Equivalent
    static void fun4(int n){
        if(n==0)
            return;

        fun4(n/2);
        System.out.println(n%2);
    }



}
