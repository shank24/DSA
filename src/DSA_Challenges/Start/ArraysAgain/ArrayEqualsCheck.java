package DSA_Challenges.Start.ArraysAgain;

import java.util.Arrays;

public class ArrayEqualsCheck {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};

        checkEqualityOfArray(arr1, arr2);
        checkWithBuiltIn(arr1, arr2);
    }

    private static void checkWithBuiltIn(int[] arr1, int[] arr2) {
        boolean res = Arrays.equals(arr1,arr2);
        System.out.println(res);
    }

    private static void checkEqualityOfArray(int[] arr1, int[] arr2) {
        boolean res = true;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }


        if (res)
            System.out.println("Equals");
        else
            System.out.println("Not equal");
    }
}
