package GFG.Arrays.problemsInSession;

import GFG.util.GetNumber;

import java.util.Scanner;

public class SearchElemInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = GetNumber.getNumber();
        int arr[] = new int[n];

        System.out.println("Enter The Numbers For Arrays ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter The Number To Search");
        int search = scanner.nextInt();

        System.out.println(searchNum(arr, search));
    }

    private static boolean searchNum(int[] arr, int search) {

        int flag=0;
        if(arr.length==0)
            return false;

        int i=0;
        while (i<=arr.length){
            if(arr[i]==search){
                flag=1;
                break;
            }
            i++;
        }

        if(flag==1)
            return true;
        else
            return false;
    }
}
