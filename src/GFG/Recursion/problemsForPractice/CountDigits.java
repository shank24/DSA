package GFG.Recursion.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class CountDigits {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        System.out.println(countDigits(n));
        System.out.println(countDigitsRec(n));
        System.out.println(countDigitsLog(n));
        System.out.println(countDigitsString(n));
    }

    //Iterative Way
    public static int countDigits(int n)
    {
        if(n==0)
            return 0;

        int count=0,val;

        while(n!=0){
            n=n/10;
            count++;

        }
        return count;
    }

    //Recursive Way

    public static int countDigitsRec(int n)
    {
        if(n/10 == 0)
            return 1;
        return (1+countDigitsRec(n/10));
    }

    //Logarithmic Way
    public static int countDigitsLog(int n){

        return (int)Math.floor(Math.log10(n)+1);
    }

    //String Based
    public static int countDigitsString(int n){
        String str = Integer.toString(n);
        return str.length();
    }
}
