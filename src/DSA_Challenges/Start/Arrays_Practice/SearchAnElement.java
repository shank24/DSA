package DSA_Challenges.Start.Arrays_Practice;

import Naveen_Automation_Labs.Collection.List.ArrayListCompare;

import java.util.Arrays;

public class SearchAnElement {

    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 9, 7, 2, 6, 10};
        int search = 7;

        findNumber(arr,search);
        Integer[] arr1 ={5, 1, 1, 9, 7, 2, 6, 10};
        findNumberWithList(arr1,search);
    }

    private static void findNumberWithList(Integer[] arr1, int search) {
        boolean contains = Arrays.asList(arr1).contains(search);
        System.out.println(contains);
    }

    private static void findNumber(int[] arr, int search) {
        if(arr.length==0)
            return;

        for (int i = 0; i <arr.length ; i++) {
            if(search == arr[i]){
                System.out.println("Number is present");
                break;
            }
        }
    }
}
