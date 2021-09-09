package LeetCode.Easy;

import java.util.HashMap;

public class Array_Sum {
    public static void main(String[] args) {

        int val[] = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum(val, target);
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;

    }


}
