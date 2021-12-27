package GFG.Recursion.problemsForPractice;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Lucky_Number {
    public static int counter=2;

    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        //System.out.println(isLucky(n));
        System.out.println(isLuckyOne(n));

    }

    private static boolean isLuckyOne(int n) {
        if(counter > n)
            return true;
        if(n%counter == 0)
            return false;

        /*calculate next position of input no.
        Variable "next_position" is just for
        readability of the program we can
        remove it and update in "n" only*/
        int next_position = n - (n/counter);

        counter++;
        return isLucky(next_position);
    }

    public static boolean isLucky(int n)
    {
        int counter = 2;
        return callMe(n,counter);
    }

    public static boolean callMe(int n, int counter)
    {
        if (counter > n) return true;
        if (n % counter == 0) return false;
        n -= (n / counter);
        counter++;
        return callMe(n, counter);
    }





}
