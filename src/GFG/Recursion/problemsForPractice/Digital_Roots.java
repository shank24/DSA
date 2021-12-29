package GFG.Recursion.problemsForPractice;

import GFG.util.GetNumber;

public class Digital_Roots {
    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        System.out.println(getDigitalRootsIterativeWay(n));
        System.out.println(getDigitalRootsRec(n));

    }

    private static int getDigitalRootsRec(int n) {
        if(n == 0) return 0;
        if(n % 9  == 0) return 9;
        return (n % 9);
    }

    private static int getDigitalRootsIterativeWay(int n) {

        int sum = 0;

        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum= 0;
            }

            sum += n % 10;
            n /= 10;
        }
        return sum;


    }



}
