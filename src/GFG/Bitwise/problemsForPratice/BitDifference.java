package GFG.Bitwise.problemsForPratice;

import GFG.util.GetNumber;

public class BitDifference {
    public static void main(String[] args) {

        System.out.println("Enter the First Number");
        int a = GetNumber.getNumber();

        System.out.println("Enter the Second Number");
        int b = GetNumber.getNumber();

        System.out.println(countBitsFlip(a,b));
    }

    public static int countBitsFlip(int a, int b){

        int count=0;
        if(a==b)
            return 0;

        int x = (a^b);

        while (x>0){
            x = (x & (x-1));
            count++;
        }

        return count;

    }
}
