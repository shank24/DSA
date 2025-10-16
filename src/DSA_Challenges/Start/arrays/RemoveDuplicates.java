package DSA_Challenges.Start.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = scanner.nextInt();
        int[] arr = new int[range];

        getArray(arr);
        removeDuplicates(arr);
        removeDuplicatesWithLoop(arr);
    }

    private static void removeDuplicates(int[] arr) {
        Set<Integer> s = new HashSet<>();

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) {
                s.add(arr[i]);
                arr[counter++] = arr[i];
            }
        }

        System.out.println("Unique Arrays");
        for (int i = 0; i < counter; i++) {
            System.out.println(arr[i]);
        }
    }


    private static void removeDuplicatesWithLoop(int[] arr) {

        int counter = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                arr[counter++]=arr[i];
            }
        }

        System.out.println("Unique Arrays");
        for (int i = 0; i < counter; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void getArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

}
