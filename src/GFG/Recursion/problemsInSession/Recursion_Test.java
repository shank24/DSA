package GFG.Recursion.problemsInSession;

import GFG.util.GetNumber;

public class Recursion_Test {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        fun1(n);
    }

    static void fun1(int n){
        if(n==0)
            return;

        System.out.println("GFG");
        fun1(n-1);
    }

}
