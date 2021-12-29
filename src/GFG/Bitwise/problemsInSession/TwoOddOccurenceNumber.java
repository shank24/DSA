package GFG.Bitwise.problemsInSession;

import GFG.util.GetNumber;

import java.util.Scanner;

public class TwoOddOccurenceNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = GetNumber.getNumber();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //findOddOccuenceInArray(arr);
        oddAppearing(arr);

    }

    private static void oddAppearing(int arr[])
    {
        int xor = 0, res1 = 0, res2 = 0;

        for (int i = 0; i < arr.length; i++)
            xor = xor ^ arr[i];

        //This exp is to find the rightmost set bit.
        int sn = xor & (~(xor - 1));


        //Here we are doing xor of both the odd appearing number
        //Dividing it into 2 parts.
        //Group 1 - (With last bit set)
        //Group 2 - (Not last bit set)
        //Group 1 - (3,3,5,7,7)
        //Group 2 - (4,4,4,4,6)
        //Now do xor of both the group and
        //the one which is left out in each group
        //is our answer.

        for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }


        System.out.println( res1 + " " + res2);

    }


    //Time Complexity of This Solution is Big(O(n-square)).

    //Naive Solution
    private static void findOddOccuenceInArray(int[] arr) {

        if(arr.length<=0)
            return;

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==arr[i])
                    count++;
            }
                if(count%2!=0)
                    System.out.println(arr[i]);
            }

    }
}
