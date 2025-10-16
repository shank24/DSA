package DSA_Challenges.Start.arrays_revisit;

import java.util.Arrays;

public class Sortarray {
    public static void main(String[] args) {
        int[] arr =  {1,4,2,0,7,6,-1};

        sortBubble1(arr);
        sortBubble2(arr);
        sortBuiltIn(arr);
    }

    private static void sortBuiltIn(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Built In");
        for (int j:arr) System.out.println(j);
    }

    //Ascending
    private static void sortBubble1(int[] arr) {

        int temp=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    //Descending
    private static void sortBubble2(int[] arr) {

        int temp=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
