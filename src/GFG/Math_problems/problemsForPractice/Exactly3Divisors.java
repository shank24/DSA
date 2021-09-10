package GFG.Math_problems.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Exactly3Divisors {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(countNumberWith3Divisors(n));
    }

    /*
    One need to find all prime number upto N,
    and then for each prime number p,
    check whether square of p is less than or equal to N or not,
    and then you can count.
    As the square of a prime number is always have exactly 3 divisors.
     */

    public static int countNumberWith3Divisors(int N)
    {

        int count = 1;

        if(N <= 3){
            return 0;
        }

        for(int i = 3; i <= Math.sqrt(N); i++ ){

            if(isPrime(i) && (i * i) <= N){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n){

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


}
