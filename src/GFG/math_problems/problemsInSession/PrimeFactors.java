package math_problems.problemsInSession;

// Time Complexity - Big(O(n^2logn))
// Time Complexity - Theta(Sqrt(n)) - in moreOptimizedWay

import static math_problems.problemsInSession.CheckPrime.*;

public class PrimeFactors {

    public static void main(String[] args) {

        int number1 = GetNumber.getNumber();

        //findPrimeFactors(number1);
        //efficientSolution(number1);
        moreOptiizedWay(number1);
    }

    private static void moreOptiizedWay(int n) {

        if(n<=1)
            return;
        while (n%2==0){
            System.out.println("2");
            n/=2;
        }

        while (n%3==0){
            System.out.println("3");
            n/=3;
        }

        for (int i = 5; i*i <=n ; i=i+6) {

            while (n%i==0){
                System.out.println(i);
                n=n/i;
            }

            while (n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }

        if(n>3)
            System.out.println(n);


    }

    private static void efficientSolution(int number1) {
        if(number1<=1)
            return;

        for (int i = 2; i*i<=number1 ; i++) {
                while (number1%i==0){
                    System.out.println(i);
                    number1/=i;
                }
        }
        if(number1>1)
            System.out.println(number1);
    }

    private static void findPrimeFactors(int number1) {

        for (int i = 2; i <number1 ; i++) { // Big(O(n))
            if(optimizedWay(i))
            {
                int x = i;
                while (number1%x==0){   // // Big(O(n))
                    System.out.println(i);
                    x=x*i;                  // Big(O(logn))
                }
            }
        }
    }

}
