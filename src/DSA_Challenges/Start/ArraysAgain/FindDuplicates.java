package DSA_Challenges.Start.ArraysAgain;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        //int[] arr = new int[]{1,2,1,3,3,4,5,2};
        int[] arr = new int[]{5, 1, 1, 9, 7, 2, -6, 106};

        removeDuplicate(arr);
    }

    private static void removeDuplicate(int[] arr) {

        if(arr.length<=1)
            return;

        int counter=0;
        int dup = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                arr[counter++] = arr[i];
            }else{
                arr[dup++]=arr[i];
            }
        }

        System.out.println("Duplicate elements");
        for (int i = 0; i < dup ; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Unique Elements");
        for (int i = 0; i < counter; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
