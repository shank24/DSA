package GFG.Recursion.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

import java.util.Scanner;

public class Power_Of_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long r = scanner.nextLong();


        System.out.println(power(n,r));
        System.out.println(power1(n,r));
        System.out.println(pow(n,r));


    }

    private static long power(long n,long r){
     long res = getPowerRecWay(n,r);
     return (res%1000000007);
    }

    private static long getPowerRecWay(long n, long power) {
        if(power!=0)
            return (n * getPowerRecWay(n,power-1));
        else
            return 1;

    }

    //For Higher Range Input
    private static long power1(long m,long n)
    {
        if(n==0)
            return 1;

        if(n%2==0){
            long y=power1(m,n/2);
            return (y%1000000007*y%1000000007)%1000000007;
        }
        else
            return (m*power1(m,n-1)%1000000007)%1000000007;
    }

    private static long pow(long n, long r){
        if(r == 0) return 1;
        if(r%2 == 0) return (pow((n*n)%1000000007, r/2))%1000000007;
        return (n*pow((n*n)%1000000007, (r-1)/2))%1000000007;
    }
}
