package DSA_Challenges.Start.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAnElementInAnArray {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int range = scanner.nextInt();
        int[] arr = new int[range];
        int searchNumber = scanner.nextInt();
        inputArrays(arr);
        checkPresence(arr, searchNumber);
        checkWithList(searchNumber);
    }

    private static void checkWithList(int searchNumber) {
        Integer[] a = { 5, 1, 1, 9, 7, 2, 6, 10 };
        boolean test = Arrays.asList(a).contains(searchNumber);
        System.out.println(searchNumber + " Is Present in the array :" + test);
    }

    private static void inputArrays(int[] arr) {
        boolean flag = false;
        if (arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    private static void checkPresence(int[] arr, int searchNumber) {
        boolean flag = false;

        for(int val: arr){
            if(val == searchNumber){
                flag = true;
                break;
            }
        }
        System.out.println(searchNumber + " Is Present in the array :" + flag);
    }
}
