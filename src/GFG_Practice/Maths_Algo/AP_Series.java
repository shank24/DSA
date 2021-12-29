package GFG_Practice.Maths_Algo;

import GFG.util.GetNumber;

public class AP_Series {
    public static void main(String[] args) {
        int a1 = GetNumber.getNumber();
        int a2 = GetNumber.getNumber();
        int n = GetNumber.getNumber();

        System.out.println(nthTermOfAP(a1, a2, n));
    }

    static int nthTermOfAP(int A1, int A2, int N) {
        // code here
        return (A1+(N-1)*(A2-A1));
    }
}
