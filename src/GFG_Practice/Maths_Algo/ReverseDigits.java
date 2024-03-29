package GFG_Practice.Maths_Algo;

import GFG.util.GetLongNumber;

public class ReverseDigits {
    public static void main(String[] args) {

        long n = GetLongNumber.getLongNumber();
        System.out.println(reverse_digit(n));
    }

    public static long reverse_digit(long n)
    {
        if(n<=0)
            return n;

        long sum=0;
        while (n!=0){
            sum = n%10 + (sum*10);
            n=n/10;
        }

        return sum;
    }
}
