package DSA_Challenges.Start.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortAnArrayInDesc {
    static Scanner scanner;

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = scanner.nextInt();
        int[] arr = new int[range];

        getArray(arr);
        System.out.println("Sorted Array Using Bubble Sort");
        sortArrayOldWay(arr);
        System.out.println("Sorted Array Built In Method");
        sortArrayUsingBuiltIn(arr);
    }


    private static void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }


    private static void sortArrayOldWay(int[] arr) throws Exception {
        if (arr.length <= 1) {
            throw new Exception("Values are not enough");
        }

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int val : arr)
            System.out.println(val);
    }

    private static void printArrayInReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    private static void sortArrayUsingBuiltIn(int[] arr) throws Exception {
        if (arr.length <= 1) {
            throw new Exception("Values are not enough");
        }

        Arrays.sort(arr);
        printArrayInReverse(arr);
    }
}
