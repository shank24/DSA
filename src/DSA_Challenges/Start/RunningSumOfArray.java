package DSA_Challenges.Start;

import GFG.util.GetNumber;

import java.util.Scanner;

/**
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows:
 * [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class RunningSumOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = GetNumber.getNumber();
        int arr[] = new int[range];

        System.out.println("Enter the Elements in an array");
        for (int i = 0; i <range ; i++) {
            arr[i]=scanner.nextInt();
        }

        int arr1[] = runningSum(arr);

        for (int i = 0; i <range ; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static int[] runningSum(int[] nums) {
        int array[] = new int[nums.length];

        for (int i = 0; i <nums.length; i++) {
            for(int j = 0; j <i; j++)
                array[j] = nums[j]+nums[j+1];
        }
        return array;
    }
}
