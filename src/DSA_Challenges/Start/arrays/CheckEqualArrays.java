package DSA_Challenges.Start.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckEqualArrays {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = scanner.nextInt();
        int[] arr1 = new int[range];
        int[] arr2 = new int[range];

        getArray(arr1);
        getArray(arr2);
        checkEqualsWithBuiltIn(arr1, arr2);
        checkEqualsLoop(arr1, arr2);
    }

    private static void checkEqualsLoop(int[] arr1, int[] arr2) {
        // Initialize result to true
        boolean res = true;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    res = false;
                    break;
                }
            }
        }
        else{
            res=false;
        }

        if(res)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }

     private static void checkEqualsWithBuiltIn(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean test = Arrays.equals(arr1, arr2);
        System.out.println(test);
    }

    private static void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }


}
