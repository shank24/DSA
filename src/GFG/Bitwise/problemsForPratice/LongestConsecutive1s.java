package GFG.Bitwise.problemsForPratice;

import GFG.Math_problems.problemsInSession.GetNumber;

//T.Complexity is O(k), where k is the length of max
//consecutive 1s

//Space Com - O(1)
public class LongestConsecutive1s {
    public static void main(String[] args) {
        int a = GetNumber.getNumber();

        System.out.println(maxConsecutiveOnes(a));
    }



    /*  Function to calculate the longest consecutive ones
     *   N: given input to calculate the longest consecutive ones
     */

    public static int maxConsecutiveOnes(int n) {

        int count=0;

        while (n>0){
            n = n & (n<<1);
            count++;
        }
        return count;
    }


}
