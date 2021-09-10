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

        for (int i = 1; i <n ; i++) {
            res=res^arr[i];
        }

        for (int i = 2; i <=n+1 ; i++) {
            res1=res1^i;
        }

        return (res1^res);
    }

}
