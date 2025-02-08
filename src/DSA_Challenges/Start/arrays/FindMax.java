package DSA_Challenges.Start.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FindMax {

    static Scanner scanner;

    public static void main(String[] args) throws Exception {

        scanner = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = scanner.nextInt();
        int[] arr = new int[range];

        getArray(arr);
        System.out.println(findMaxWithArrays(arr));
        findMaxTraditional(arr);
        System.out.println(findMaxViaStream(arr));
    }



    private static void getArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        String array = Arrays.toString(arr);
        //System.out.println(array);
    }

    private static int findMaxWithArrays(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    private static void findMaxTraditional(int[] arr) throws Exception {

        if(arr.length<=1)
        {
            throw new Exception("Values are not present to compare");
        }

        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
    }

    private static int findMaxViaStream(int[] arr) {
        IntStream stream = Arrays.stream(arr);
        return stream.max().orElse(-1);
    }

}
