package math_problems.problemsForPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class DigitsInFact {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T>0){
            int num = sc.nextInt();
            System.out.println(digitsOptimizedWay(num));
            T--;
        }
    }

    private static long digitsInFact(long num) {
        java.math.BigInteger fact = BigInteger.ONE;


        if(num==0)
            return 1;

        for (int i = 1; i <=num ; i++) {
            fact = (BigInteger) fact.multiply(BigInteger.valueOf(i));
        }

        int count=0;

        while (fact.compareTo(BigInteger.ZERO)!=0){
            count++;
            fact= (BigInteger) fact.divide(BigInteger.TEN);
        }
        return count;
    }

    private static int digitsOptimizedWay(int n){
        if(n<0)
            return 0;

        if(n<=1)
            return 1;

        double digits =0;
        for (int i = 2; i <=n ; i++) {
            digits+=Math.log10(i);
        }

        return (int) (Math.floor(digits)+1);
    }
}
