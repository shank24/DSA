package GFG.Analysis_of_algorithm.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

import java.util.Scanner;

public class FindNumberInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = GetNumber.getNumber();
        int arr[] = new int[range];

        System.out.println("Enter the Elements in an array");
        for (int i = 0; i <range ; i++) {
            arr[i]=scanner.nextInt();
        }

        System.out.println("What do you want to find bro ???");
        int elementToSearch = scanner.nextInt();
        System.out.println("The index of element is " + search(arr, range, elementToSearch));


    }

    private static int search(int[] arr, int range, int elementToSearch) {
        for (int i = 0; i <range ; i++) {
            if(arr[i]==elementToSearch)
                return i;
        }
        return -1;
    }
}
