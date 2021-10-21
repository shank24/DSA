package GFG.Practice_Problems.Maths_Algo;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Armstrong_Number {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        System.out.println(armstrongNumber(n));

    }
    static String armstrongNumber(int n){
        int value = n;
        int r=0, sum=0;

        while(n!=0){
            r=n%10;
            sum=sum+r*r*r;
            n/=10;
        }

        if(sum==value)
            return "Yes";
        else
            return "No";

    }
}
