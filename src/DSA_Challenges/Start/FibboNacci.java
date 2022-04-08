package DSA_Challenges.Start;

import GFG.util.GetNumber;

public class FibboNacci {
    public static void main(String[] args) {

        int range = GetNumber.getNumber();
        System.out.println(fibbo(range));
    }

    public static int fibbo(int range) {
        if(range<=1)
            return range;
        return fibbo(range-1)+fibbo(range-2);
    }
}
