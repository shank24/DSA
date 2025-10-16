package DSA_Challenges.Start.Arrays_Practice;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElem {
    public static void main(String[] args) {
        // Create Array 1
        String[] arr1 = {"Article", "in", "Geeks", "for", "Geeks"};

        // Create Array 2
        String[] arr2 = {"Geeks", "for", "Geeks"};

        findCommonElem(arr1, arr2);

        // create Array 1
        int[] arr11 = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };

        // create Array 2
        int[] arr22 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };

        findCommonInt(arr11,arr22);
    }

    private static void findCommonInt(int[] arr11, int[] arr22) {
        Set<Integer> val1 = new HashSet<>();
        Set<Integer> val2 = new HashSet<>();

        for (int val: arr11){
            val1.add(val);
        }

        for (int val: arr22){
            val2.add(val);
        }

        val1.retainAll(val2);
        System.out.println(val1.toString());
    }

    private static void findCommonElem(String[] arr1, String[] arr2) {

        Set<String> val = new HashSet<>();

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i].equals(arr2[j])) {
                        val.add(arr1[i]);
                    }
                }

            }

        System.out.println(val.toString());
    }
}
