package GFG.Math_problems.problemsInSession;

// Time Complexity - Theta(n)
// Auxillary Space - Theta(1)

import GFG.util.GetNumber;

// Time Complexity - optimizedInSorted - Theta(Sqrt(n)) + Theta(Sqrt(n)) -> Theta(Sqrt(n))
public class AllDivisors {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();
        
        //findAllDivisors(n);
        optimizedWay(n);
        //optimizedWayInSortedOrder(n);


    }

    private static void optimizedWayInSortedOrder(int n) {

        int i;
        for ( i = 1; i*i <n ; i++) {
            if (n % i == 0)
                System.out.println(i);
        }

        //The value of i is continous here
        for (; i>=1; i-- ){
            if(n%i==0)
                System.out.println(n/i);
        }
    }

    private static void optimizedWay(int n) {
        if(n<=1)
            return;

        for (int i = 1; i*i <=n ; i++) {

            if (n % i == 0) {
                System.out.println(i);
                   if (i != n / i)
                    System.out.println(n / i);
            }
        }
    }

    private static void findAllDivisors(int n) {
        if(n<=1)
            return;

        for (int i = 1; i <=n; i++) {
            if(n%i==0)
                System.out.println(i);
        }
    }
}
