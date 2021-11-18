package GFG.Bitwise.problemsForPratice;

import GFG.Math_problems.problemsInSession.GetNumber;

import java.util.Scanner;

public class Max_And_Value {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = GetNumber.getNumber();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxAND(arr,n));
    }

    public static int checkBit(int pattern, int arr[], int n){

        int count=0;
        //Iterating over all elements in an array.

        for (int i = 0; i < n; i++) {
            //incrementing counter if element has set MSB as of pattern.

            if((pattern & arr[i]) == pattern)
                count++;
        }

        //returning the number of element having set MSB as of pattern.
        return count;
    }
    // Function for finding maximum AND value.
    public static int maxAND (int arr[], int n) {

        int res=0, count;

        //Iterating over total of 16 bits from MSB to LSB...
        for (int bit = 16; bit >=0 ; bit--) {
            //Finding the count of element in the array
            //having set MSB as of (res | (1 << bit)].

            count = checkBit(res | (1<<bit),arr,n);
            //res | 1 << 9
            // 1 0000 0000 0

            if(count >=2)
                res |=(1<<bit);
        }

        //returning the final max And Value

        return res;

    }
}
