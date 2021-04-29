package analysis_of_algorithm.problemsInSession;

import math_problems.problemsInSession.GetNumber;

public class Sum_First_Natural_Numbers {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        System.out.println(fun1(n));
        System.out.println(fun2(n));
        System.out.println(fun3(n));

    }

    private static int fun1(int n) {
        if (n==0 || n<0){
            return 0;
        }
        return n*(n+1)/2;
    }

    private static int fun2(int n) {
        int sum=0;

        if (n==0|| n<0){
            return 0;
        }

        for (int i = 1; i <= n; i++) {
            sum = sum +i;
        }
        return sum;
    }

    private static int fun3(int n) {
        int sum = 0;

        if (n==0 || n<0){
            return 0;
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=i ; j++) {
                sum++;
            }
        }
        return sum;
    }


}
