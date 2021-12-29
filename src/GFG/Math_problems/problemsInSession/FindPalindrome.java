package GFG.Math_problems.problemsInSession;

// Time Complexity is Theta(digits)


import GFG.util.GetNumber;

public class FindPalindrome {
    public static void main(String[] args) {

        int number = GetNumber.getNumber();

        System.out.println(isPalindrome(number));

    }

    private static boolean isPalindrome(int number) {
        int originalNumber = number;

        int rem=0;
        if(number<=0)
            return false;

        while (number>0){
            rem = rem*10 + number%10;
            number/=10;
        }
        return (rem==originalNumber);
    }
}
