package DSA_Challenges.Start;

import java.util.Arrays;

public class FindSecondMax {

    public static void main(String[] args) {
        int[] num = { 1567, 254, 10, 9999, 23, 18, 2589, 4444, 787, 10001, 102 };
        //int[] num = { 1567, 1567, 254, 10, 9999, 23, 18, 2589, 4444, 787, 10001, 102};
        //int[] num = { -1567, 254, 10, 9999, 23, 18, 2589, 4444, 787, 10001, 102 };
        //int[] num = { -1567, -254, -10, -9999, -23, -18, -2589, -4444, -787, -10001, -102 };
        //int[] num = {  };

        System.out.println(findSecondMax(num));

    }

    public static int findSecondMax(int num[]) {

        /*if(num.length<=1)
        {
            throw new Exception("Values are not present to compare");
        }*/

        int temp=num[0];
        int secondTop=0;

        Arrays.sort(num);


    /*for(int i=0;i<=num.length-1;i++){

        if(temp<num[i] ){
            secondTop=temp;
            temp=num[i];
    	}

    }*/

        return num[num.length-2];
    }
}
