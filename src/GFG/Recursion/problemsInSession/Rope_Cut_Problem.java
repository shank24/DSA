package GFG.Recursion.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Rope_Cut_Problem {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        int a = GetNumber.getNumber();
        int b = GetNumber.getNumber();
        int c = GetNumber.getNumber();

        System.out.println(maxPieces(n, a, b, c));
    }

    private static int maxPieces(int n, int a, int b, int c) {

        if(n==0)
            return 0;
        if(n<0)
            return -1;


        int res = Math.max(maxPieces(n-a,a,b,c),
                            maxPieces(n-b,a,b,c));


        if(res==-1)
            return -1;
        else
            return res+1;

    }
}
