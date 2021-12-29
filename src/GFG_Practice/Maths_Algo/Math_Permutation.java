package GFG_Practice.Maths_Algo;

import GFG.util.GetLongNumber;

public class Math_Permutation {
    public static void main(String[] args) {
        long n = GetLongNumber.getLongNumber();
        long r = GetLongNumber.getLongNumber();

        System.out.println(npr(n, r));
    }

    private static long npr(long n, long r) {
        if(n==0 || r==0)
            return 1;

        return (getFact(n)/getFact(n-r));

    }

    private static long getFact(long var){
        long value=1;
        while (var!=0){
            value = (value*var);
            var=var-1;
        }

        return value;
    }
}
