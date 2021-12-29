package GFG_Practice.Maths_Algo;

import GFG.util.GetNumber;
import GFG.util.GetString;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();
        String str = GetString.getString();

        System.out.println(getDecimalInt(n));
        System.out.println(getDecimalString(str));



    }

    private static int getDecimalInt(int n) {

        if(n==0)
            return 0;

        int r,sum=0,i=0;
        while (n!=0){
            r= n%10;
            sum = (int) (sum + (r*Math.pow(2,i)));
            i++;
            n=n/10;
        }

        return sum;
    }


    private static int getDecimalString(String str) {

        //Shortcut, just pass the second arg as type of decimal system
        // in which you want to convert
        return Integer.parseInt(str,2);
    }
}
