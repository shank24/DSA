package GFG.Recursion.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class CountDigits {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        System.out.println(countDigits(n));
    }

    //Iterative Way
    public static int countDigits(int n)
    {
        if(n==0)
            return 0;

        int count=0,val;

        while(n!=0){
            val = n%10;
            count++;
            n=n/10;
        }
        return count;
    }

    //Recursive Way
}
