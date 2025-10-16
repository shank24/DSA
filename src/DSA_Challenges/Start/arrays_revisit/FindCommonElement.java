package DSA_Challenges.Start.arrays_revisit;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElement {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {1,2,3};

        findCommonUsingSet(arr1,arr2);
    }

    private static void findCommonUsingSet(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i: arr1){
            set1.add(i);
        }

        for (int i: arr2){
            set2.add(i);
        }
        set1.retainAll(set2);
        set2.retainAll(set1);

        System.out.println(set1.toString());
    }

}
