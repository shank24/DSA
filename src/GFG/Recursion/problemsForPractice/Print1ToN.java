package GFG.Recursion.problemsForPractice;

import GFG.util.GetNumber;

public class Print1ToN {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        printNos(n);
    }

    static void printNos(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        printNos(n-1);
        System.out.print(n+" ");

    }
}
