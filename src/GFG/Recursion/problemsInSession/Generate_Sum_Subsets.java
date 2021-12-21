package GFG.Recursion.problemsInSession;

public class Generate_Sum_Subsets {
    public static void main(String[] args) {

        int n=3;
        int arr[] = {10,15,20};
        int sum =25;

        System.out.println(countSubsets(arr, n, sum));
        System.out.println(countSubsetsIterativeWay(arr, sum));
    }

    static int countSubsets(int arr[], int n, int sum)
    {
        if(n==0)
            return sum==0? 1 : 0;
        return countSubsets(arr, n-1, sum) + countSubsets(arr, n-1, sum - arr[n-1]);
    }

    static int countSubsetsIterativeWay(int arr[], int sum){

        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i] + arr[j] == sum){
                    count++;
                }
            }
        }

        return count;
    }
}
