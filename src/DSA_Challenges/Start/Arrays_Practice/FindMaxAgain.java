package DSA_Challenges.Start.Arrays_Practice;

import java.util.Arrays;

public class FindMaxAgain {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 9, 7, 2, -6, 106};
        findMaxNum(arr);
        findSecondMaxNum(arr);
        findWithSort(arr);
    }

    private static void findWithSort(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }

    private static void findSecondMaxNum(int[] arr) {
        int max = arr[0];
        int secondMax =0;
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i]){
                secondMax=max;
                max=arr[i];
            }
        }
        System.out.println(secondMax);
    }

    private static void findMaxNum(int[] arr) {
        if(arr.length==0)
            return;

        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
