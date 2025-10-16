package DSA_Challenges.Start.arrays_revisit;

public class RetunrSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumOfArray(arr);
        int[] arr1 = sumOfArrayByElements(arr);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
    }

    private static int[] sumOfArrayByElements(int[] arr) {
        int[] num = new int[arr.length];
        num[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            num[i] = num[i-1] +arr[i];
        }
        return num;
    }

    private static void sumOfArray(int[] arr) {

        int sum = 0;
        for (int j:arr){
            sum = sum + j;
        }
        System.out.println("Sum Of Array " + sum);
    }
}
