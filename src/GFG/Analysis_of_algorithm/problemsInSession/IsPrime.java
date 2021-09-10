package GFG.Analysis_of_algorithm.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class IsPrime {

    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(FindPrime(n));
    }

    private static boolean FindPrime(int n) {

        if(n==1)
            return false;

        if(n==2 || n==3)
            return true;

        if(n%2==0 || n%3==0 )
            return false;

        for (int i = 5; i*i <=n; i=i+6) {
                if(n%i==0 || n%(i+2)==0){
                    return false;
            }
        }
        return true;
    }
    //Time Complexity - (Big-O(Sqrt(n)))
}
