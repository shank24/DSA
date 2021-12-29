package GFG.Bitwise.problemsInSession;

import GFG.util.GetNumber;

public class CountSetBitsOptimizedWay {

    static int []table = new int[256];

    // recursive function to count set bits
    public static void initialize() {

        // To initially generate the table algorithmically:
        table[0] = 0;
        for (int i = 0; i < 256; i++)
        {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    public static int countSetBitsOptimized(int n)
    {
        return table[n & 0xff] +
                table[(n >> 8) & 0xff] +
                table[(n >> 16) & 0xff] +
                table[n >> 24];
    }

    public static void main(String[] args) {

        int n = GetNumber.getNumber();
        initialize();
        System.out.println(countSetBitsOptimized(n));
    }


}
