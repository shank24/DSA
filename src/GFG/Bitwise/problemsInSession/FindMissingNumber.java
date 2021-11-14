package GFG.Bitwise.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = GetNumber.getNumber();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.println(usingXORWay(arr,n));
    }

    private static int usingXORWay(int[] arr, int n) {
        if(n==0)
            return 0;

        int res = arr[0],res1=1;

        //First loop is calculating all the numbers from
        // (arr[0]....(n-1))
        for (int i = 1; i <n ; i++) {
            res=res^arr[i];
        }

        //Second loop is calculating all the numbers from
        // (2....(n+1))
        // Here res1 = 1, so 1 is excluded

        for (int i = 2; i <=n+1 ; i++) {
            res1=res1^i;
        }

        //So XOR of both loop will give the missing number.
        return (res1^res);
    }

}
