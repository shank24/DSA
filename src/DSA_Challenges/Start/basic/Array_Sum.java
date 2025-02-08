package DSA_Challenges.Start.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Array_Sum {
    public static void main(String[] args) {

        int[] val = {1, 7, 2, 4,-8};
        int target = -7;

        System.out.println("Indices : " + twoSumIndices(val, target));
        System.out.println("Result : " + twoSumValues(val, target));
        System.out.println("Values Via Loop : " + twoSumLoop(val, target));
    }

    /*
    Here, it is capturing indices
 */
    public static String twoSumIndices(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                result[1] = i;
                result[0] = map.get(value); // Fetching indices of the value
            }
            map.put(nums[i], i);
        }
        return Arrays.toString(result);
    }

    /*
    Here, it is capturing values via Set
     */
    public static boolean twoSumValues(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int[] res = new int[2];
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (set.contains(complement)) {
                res[1] = nums[i];
                res[0] = complement;
                flag=true;
            }
            set.add(nums[i]);
        }
        System.out.println("Values  : " + Arrays.toString(res));
        return flag;

    }

    private static String twoSumLoop(int[] nums, int target) {

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[i] = nums[i];
                    arr[i + 1] = nums[j];
                }
            }
        }
        return Arrays.toString(arr);
    }

}
