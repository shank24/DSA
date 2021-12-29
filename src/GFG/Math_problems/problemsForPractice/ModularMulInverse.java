package math_problems.problemsForPractice;

import GFG.util.GetNumber;

public class ModularMulInverse {
    public static void main(String[] args) {

        int a = GetNumber.getNumber();
        int m = GetNumber.getNumber();

        System.out.println(findModuloMultiInverse(a,m));

    }

    private static int findModuloMultiInverse(int a, int m) {

        int val=-1;
        int b=1;
        while (b<m){
            if((a*b)%m==1)
                val=b;
            b++;
        }
        return val;
    }
}
