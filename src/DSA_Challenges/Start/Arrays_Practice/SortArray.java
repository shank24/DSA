package DSA_Challenges.Start.Arrays_Practice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 9, 7, 2, -6, 106};
        char[] b = { 'b', 'a', 'c', 'b' };
        sortArray(b);
        sortArray(arr);
        printInReverse(arr);
    }

    private static void printInReverse(int[] arr) {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void sortArray(int[] arr) {
        if(arr.length == 0)
            return;
        arraySortLogic(arr);
    }
    private static void sortArray(char[] arr) {
        if(arr.length == 0)
            return;
        arraySortLogic(arr);
    }

    private static void arraySortLogic(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]> arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void arraySortLogic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
