package DSA_Challenges.Start.Arrays_Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1,1,1,1,1,1, 9, 7, 2, -6, 106};
        removeDup(arr);
    }

    private static void removeDup(int[] arr) {

        HashSet<Integer> val = new HashSet<>();

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!val.contains(arr[i])) {
                val.add(arr[i]);
                arr[counter++] = arr[i];
            }
        }


        System.out.println("Unique Elements");
        for (int i = 0; i < counter; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
