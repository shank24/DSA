package DSA_Challenges.Start.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindHighestInArray {
    static Scanner scanner;

    public static void main(String[] args) throws Exception {
        scanner = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = scanner.nextInt();
        int[] arr = new int[range];

        getArray(arr);
        findMaxTraditional(arr);
        findMaxWithArrays(arr);
        findMaxViaStream(arr);
        findMaxWithInt(arr);
    }

    private static void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    private static void findMaxTraditional(int[] arr) throws Exception {
        if (arr.length <= 1)
            throw new Exception("Values are not present to compare");

        int max = arr[0];

        for (int val : arr) {
            if (max < val) {
                max = val;
            }
        }
        System.out.println(max);
    }


    private static void findMaxWithArrays(int[] arr) throws Exception {
        if (arr.length <= 1)
            throw new Exception("Values are not present to compare");

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

    private static void findMaxViaStream(int[] arr) {
        IntStream stream = Arrays.stream(arr);
        System.out.println(stream.max().orElse(-1));
    }

    private static void findMaxWithInt(int[] arr) {
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
