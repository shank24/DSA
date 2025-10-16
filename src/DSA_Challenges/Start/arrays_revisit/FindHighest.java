package DSA_Challenges.Start.arrays_revisit;

import java.util.Arrays;

public class FindHighest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,99};

        findMax(arr);
        findSecondMax1(arr);
        findSecondMax2(arr);
    }

    private static void findSecondMax2(int[] arr) {
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
        }
        System.out.println(secondMax + " " +  max);
    }

    private static void findSecondMax1(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }

    private static void findMax(int[] arr) {

        int max = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
