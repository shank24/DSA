package math_problems.problemsForPractice;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T>0){
            int num = sc.nextInt();
            System.out.println(returnFact(num));
            T--;
        }
    }

    private static long returnFact(long num) {
        long fact = 1;

        if(num==0)
            return 1;

        for (int i = 1; i <=num ; i++) {
            fact = fact*i;
        }

        return fact;
    }

}

