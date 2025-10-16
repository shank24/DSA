package DSA_Challenges.Start.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SortZerosAndOnes {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int range = scanner.nextInt();
        int [] array = new int[range];
        inputArrays(array);


    }

    private static void inputArrays(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
           arr[i] = scanner.nextInt();
        }
        sortArrays(arr);
    }

    private static void sortArrays(int[] arr) {
        if(arr.length<=0)
            return;

       Arrays.sort(arr);

        System.out.println("Sorted array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
