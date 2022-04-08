package DSA_Challenges.Start;

import GFG.util.GetNumber;

public class Palindrome {
    public static void main(String[] args) {
        int number = GetNumber.getNumber();
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        int val = x;
        int r,sum=0;

        if(x < 0){
            return false;
        }

        while(x!=0){
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }

        return (val==sum)?true:false;

    }
}
