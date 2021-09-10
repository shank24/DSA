package GFG.Bitwise.problemsForPratice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class OnesComplement {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(findOnesComplement(n));
    }

    private static int findOnesComplement(int n) {

        int numberOfBits;
        if(n==0){
            return 0;
        }

        numberOfBits = countSetBits(n);

        return (((1<<numberOfBits)-1)^n);
    }

    private static int countSetBits(int n) {

        return (int)(Math.floor(Math.log(n)/Math.log(2)))+1;
    }

}
