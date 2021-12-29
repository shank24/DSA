package GFG.Bitwise.problemsInSession;

import GFG.util.GetNumber;

import java.util.Scanner;

public class OddOccurenceNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = GetNumber.getNumber();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //findOddOccuenceInArray(arr);
        usingXOROperator(arr);

    }

    private static void usingXOROperator(int[] arr) {
        int res=0;
        for (int i = 0; i <arr.length ; i++) {
            res=res^arr[i];
        }
        System.out.println(res);
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
