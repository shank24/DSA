package GFG.Recursion.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        System.out.println(getSumOfDigits(n));
        System.out.println(getSumRecWay(n));
    }

    static int getSumOfDigits(int n){

        if(n==0)
            return 0;

        int sum=0;
        while (n!=0){
            sum=n%10+sum;
            n=n/10;
        }

        return sum;
    }

    static int getSumRecWay(int n){
        if(n<10)
            return n;

        return (n%10 + getSumRecWay(n/10));
    }
}
