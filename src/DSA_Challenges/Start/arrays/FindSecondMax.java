package DSA_Challenges.Start.arrays;

import java.util.Arrays;

public class FindSecondMax {

    public static void main(String[] args) throws Exception {
        int[] num = { 1567, 254, 10, 9999, 23, 18, 2589, 4444, 787, 10001, 102 };
        //int[] num = { 1567, 1567, 254, 10, 9999, 23, 18, 2589, 4444, 787, 10001, 102};
        //int[] num = { -1567, 254, 10, 9999, 23, 18, 2589, 4444, 787, 10001, 102 };
        //int[] num = { -1567, -254, -10, -9999, -23, -18, -2589, -4444, -787, -10001, -102 };
        //int[] num = {  };

        System.out.println(findSecondMax(num));
        System.out.println(findSecondMaxTraditiona(num));

    }

    private static int findSecondMaxTraditiona(int[] num) throws Exception {

        if(num.length<=1){
            throw new Exception("Values are not sufficient to compare");
        }

        int max = num[0];
        int secondMax = 0;

        for (int i = 0; i <num.length ; i++) {
            if(max < num[i]){
                secondMax = max;
                max=num[i];
            }
        }

        return secondMax;
    }

    public static int findSecondMax(int[] num) {
        Arrays.sort(num);
        return num[num.length-2];
    }
}
