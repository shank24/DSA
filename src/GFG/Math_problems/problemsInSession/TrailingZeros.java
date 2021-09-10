package GFG.Math_problems.problemsInSession;

// Time Complexity is Theta(n) - (Iterative Way)

// Time Complexity is Theta(logn) - 5 to the power k - Way

import GFG.Math_problems.problemsInSession.GetNumber;

public class TrailingZeros {
    public static void main(String[] args) {

        int number = GetNumber.getNumber();

        //System.out.println(countTrailingZeros(number));
        System.out.println(countTrailingZerosUsing5Approach(number));

    }

    private static int countTrailingZerosUsing5Approach(int number) {
        int res = 0;
        for (int i = 5; i <=number ; i=i*5) {
            res = res + number/i;
        }
        return res;
    }

    private static int findFactorial(int number) {
        int fact = 1;

        if(number==0)
            return 1;

        for (int i = 2; i <=number ; i++) {
            fact = fact*i;
        }
        return fact;
    }

    private static int countTrailingZeros(int number) {

        int count=0;
        int value = findFactorial(number);

        while (value%10==0){
            count++;
            value/=10;
        }
        return count;
    }
}
