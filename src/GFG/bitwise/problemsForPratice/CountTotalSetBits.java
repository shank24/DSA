package bitwise.problemsForPratice;

import math_problems.problemsInSession.GetNumber;

public class CountTotalSetBits {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(countSetBits(n));
        System.out.println(otherWay(n));

        //In O(logn) T.C
        System.out.println(simpleWayOut(n));
    }

    private static int simpleWayOut(int n) {
        int ans=0,i=0;
        if(n==1)
            return 1;

        for (int j = 1; j <=n ; j++) {
            int temp = j;
            while (temp!=0){
                temp=temp&(temp-1);
                ans++;
            }
        }

        return ans;
    }

    private static int otherWay(int n) {
        int result=0;

        if(n==0)
            return 0;

        for(int i=0;i<10;i++)
        {
            if (( (1<<i) & n )!=0)
                result+=1;
        }

        return(result+otherWay(n-1));
    }

    private static int countSetBits(int n) {
        int total = 0;
        int m = n;

        while (n!=0){
            total +=  returncount(n);
            n=n-1;
        }

        return total;
    }

    private static int returncount(int n) {
        int count =0;

        if(n==1)
            return 1;

        while (n!=0){
            if(n%2!=0){
                count++;
            }
            n/=2;
        }
        return count;
    }
}
