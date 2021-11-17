package GFG.Bitwise.problemsForPratice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Binary_To_Gray_Code {

    public static void main(String[] args) {

        int a = GetNumber.getNumber();
        int grey_Value = 0, binary_value=0;

        //Binary to Grey
        grey_Value = greyConverter(a);
        System.out.println(grey_Value);

        //Grey to Binary
        binary_value = binaryConverter(grey_Value);
        System.out.println(binary_value);

    }

    public static int greyConverter(int n) {
        return n^(n>>1);
    }

    public static int binaryConverter(int n) {
        int ans=0;

        while(n>0){
            ans = ans^n;
            n = n>>1;
        }
        return ans;
    }
}
