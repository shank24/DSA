package GFG.Math_problems.problemsInSession;

//TC - findSOF - Big(O(n*Sqrt(n))
//TC - moreOptimizedWay - (nloglogn)

import java.util.Arrays;
import static GFG.Math_problems.problemsInSession.CheckPrime.optimizedWay;

public class SeiveOfEratosthenes {

    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        //findSOF(n);
        optimizedApproach(n);
        //moreOptimizedWay(n);
    }

    private static void moreOptimizedWay(int n) {

        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);

        for (int i = 2; i<n ; i++) {
            if(prime[i]){
                System.out.println(i);
                for (int j = i*i; j <=n ; j=j+i) {
                    prime[j]=false;
                }
            }
        }

    }

    //Seive Way
    private static void optimizedApproach(int n) {

        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);

        for (int i =2; i*i <=n ; i++) {

            // If prime[p] is not changed, then it is a prime
            if(prime[i]){

                // Update all multiples of p
                for (int j = 2*i; j<=n ; j=j+i) {
                   prime[j]=false;
                }
            }
        }

        //Print all Prime Numbers
        for (int i=2; i<=n ; i++) {
            if(prime[i])
                System.out.print(i + " ");
        }
    }

    private static void findSOF(int n) {

        for (int i = 2; i <=n ; i++) {
            if(optimizedWay(i))
                System.out.println(i);
        }
    }
}
