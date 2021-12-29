package GFG.Math_problems.problemsInSession;

//Iterative
// Time Complexity is Theta(n)
// Auxillary Space is Big(O(1))

//Recursive
// Time Complexity is Theta(n)
// Auxillary Space is Theta(n+1)


import GFG.util.GetNumber;

import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {

        int number = GetNumber.getNumber();
        System.out.println(findFactorial(number));
        System.out.println(recursiveMethod(number));
        System.out.println(viaStream(number));
    }

    private static int viaStream(int number) {
        return IntStream.rangeClosed(2,number).reduce(1,(x,y) -> x*y);
    }

    private static int recursiveMethod(int number) {
        if(number==0)
            return 1;
        return number*recursiveMethod(number-1);
    }

    private static int findFactorial(int number) {
        int fact = 1;

        if(number==0)
            return 1;

        for (int i = 2; i <=number ; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
