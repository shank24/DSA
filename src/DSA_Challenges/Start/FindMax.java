package DSA_Challenges.Start;

public class FindMax {

    public static void main(String[] args) {

        int[] num = { 1567, 254, 10, 9999, 23, 18, 2589, 4444, 787, 10001, 102 };

        System.out.println(findMax(num));
        System.out.println(findMin(num));

    }

    private static int findMax(int[] num) {

        if(num.length==0){
            return 0;
        }

        int temp=num[0];

        for(int i=1; i<num.length; i++){
            if(temp<num[i]){
                temp=num[i];
            }
        }

        return temp;
    }

    private static int findMin(int[] num) {

        if(num.length==0){
            return 0;
        }

        int temp=num[0];

        for(int i=1; i<num.length; i++){
            if(temp>num[i]){
                temp=num[i];
            }
        }

        return temp;
    }
}
