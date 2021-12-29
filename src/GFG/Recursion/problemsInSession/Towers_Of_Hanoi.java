package GFG.Recursion.problemsInSession;

import GFG.util.GetNumber;

public class Towers_Of_Hanoi {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        ToH(n, 'A', 'B', 'C');
        System.out.println(toh(n, 'A', 'B', 'C'));
    }


    private static void ToH(int n, char A, char B, char C)
    {
        if (n == 1)
        {
            System.out.println("Move 1 from " +  A + " to " + C);
            return;
        }
        ToH(n-1, A, C, B);
        System.out.println("Move " + n + " from " +  A + " to " + C);
        ToH(n-1, B, A, C);
    }

    public static long toh(int N, int from, int to, int aux) {
        // Your code here

        if(N==0)
            return 0;

        long count = toh(N-1,from, aux, to);
        count++;
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        count += toh(N-1,aux,to,from);
        return count;

    }
}
