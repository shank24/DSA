package GFG_Practice.Maths_Algo;

import GFG.util.GetLongNumber;

public class Automorphic_Number {
    public static void main(String[] args) {
        //long n = GetLongNumber.getLongNumber();

        //System.out.println(automorphic_Number(n));
        //System.out.println(automorphic_Number_String(n));

        long min = GetLongNumber.getLongNumber();
        long max = GetLongNumber.getLongNumber();

        System.out.println(automorphic_Number_In_Range(min, max));
    }

    private static long automorphic_Number_In_Range(long min, long max) {
        long i=0;

        for (i = min; i <max ; i++) {
            if(automorphic_Number(i))
                System.out.println(i);
        }

        return i;
    }

    public static boolean automorphic_Number(long n){

    if(n<=0){
        return false;
    }
    long squareRoot = (long) Math.pow(n,2);
    long temp=n;
    long noOfDigits=0;

    //Computing number of digits
    while (temp!=0){
        noOfDigits++;
        temp=temp/10;
    }

    //Fetching Modulo value
    long lastNoOfDigits = (long) (squareRoot%(Math.pow(10,noOfDigits)));

    //Comparing Modulo value with number
    if(lastNoOfDigits==n)
        return true;
    else
        return false;

    }

    //Via String
    public static boolean automorphic_Number_String(long n){

        if(n<=0){
            return false;
        }

        long squareRoot = (long) Math.pow(n,2);

        String val = Long.toString(squareRoot);
        String num = Long.toString(n);
        if(val.endsWith(num))
            return true;
        else
            return false;
    }

    //In a Range


}
