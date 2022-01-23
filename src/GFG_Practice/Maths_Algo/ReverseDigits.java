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

        long r=0,sum=0;
        while (n!=0){
            r=n%10;
            sum = r + (sum*10);
            n=n/10;
        }

        return sum;
    }
}
