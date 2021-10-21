package GFG.Practice_Problems.Maths_Algo;

import GFG.Math_problems.problemsInSession.GetNumber;

public class IsDigPalindrome {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        System.out.println(isDigitSumPalindrome(n));


    }

    static int extractSumFromNumber(int n) {
        int r=0,sum=0;

        while (n!=0){
            r=n%10;
            sum=sum+r;
            n/=10;
        }
        return sum;
    }

    static int isDigitSumPalindrome(int N) {

        //Extracting Sum Of The Digits From A Number
        int number = extractSumFromNumber(N);

        int value = number;

        int r=0,sum=0;

        while(number!=0){
            r=number%10;
            sum = sum*10+r;
            number/=10;
        }

        if(value==sum){
            return 1;
        }
        else{
            return 0;
        }
    }



}
