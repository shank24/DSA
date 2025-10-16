package DSA_Challenges.Start.arrays_revisit;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 6, 3, 4, 5, 6, 6, 6, 6};

        removeDup1(arr);
        removeDup1Set(arr);
    }

    private static void removeDup1Set(int[] arr) {
        Set<Integer> set = new HashSet<>();

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                arr[counter++] = arr[i];
            }
        }

        for (int i = 0; i < counter; i++) System.out.println(arr[i]);
    }

    private static void removeDup1(int[] arr) {

        if (arr.length == 0) {
            return;
        }

        int counter = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[counter++] = arr[i];
            }
        }

        for (int i = 0; i < counter; i++) {
            System.out.println(arr[i]);
        }
    }
}
