package GFG.Math_problems.problemsInSession;


// Time Complexity is Theta(digits)

import GFG.Math_problems.problemsInSession.GetNumber;

public class FindDigits {

    public static void main(String[] args) {

        int number = GetNumber.getNumber();

        System.out.println(calculateNoOfDigits(number));
        System.out.println(recursiveMethod(number));
        System.out.println(logarithimicMethod(number));
        System.out.println(stringBasedSolution(number));

    }

    private static int stringBasedSolution(int number) {
        int length = String.valueOf(number).length();
        return length;
    }


    private static int logarithimicMethod(int number) {
        return (int)(Math.floor(Math.log10(number)+1));
    }

    private static int recursiveMethod(int number) {
        if (number == 0)
            return 0;
        return 1 + recursiveMethod(number/10);
    }

    private static int calculateNoOfDigits(int number) {
        int count=0;

        while (number!=0){
            number/=10;
            count++;
        }
        return count;
    }
}
