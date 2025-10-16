package DSA_Challenges.Start.arrays_revisit;

import java.util.Arrays;

public class CheckArraysEqual {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,3,4,5};

        checkEqualForLoopIn(arr1,arr2);
        checkEqualBuiltIn(arr1,arr2);

    }

    private static void checkEqualBuiltIn(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean res = Arrays.equals(arr1,arr2);
        System.out.println(res);

    }

    private static void checkEqualForLoopIn(int[] arr1, int[] arr2) {

        boolean res = true;
        if(arr1.length!=arr2.length){
            System.out.println("Arrays are not comparable");
            return;
        }
        else{
            for (int i = 0; i <arr1.length ; i++) {
                if(arr1[i]!=arr2[i]){
                    res = false;
                    break;
                }
            }
        }

        System.out.println(res);

    }
}
