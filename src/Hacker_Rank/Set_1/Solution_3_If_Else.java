package Hacker_Rank.Set_1;

import Hacker_Rank.Util.GetNumber;

public class Solution_3_If_Else {

    public static void main(String[] args) {

    int num = GetNumber.getNumber();
        System.out.println(printWeird(num));
    }

    private static int printWeird(int n) {

        if(n%2!=0){
            System.out.println("Weird");
        }
        else if(n%2==0 && (n>2 && n<=5)){
            System.out.println("Not Weird");
        }
        else if(n%2==0 && (n>6 && n<=20)){
            System.out.println("Weird");
        }
        else if(n%2==0 && n>20){
            System.out.println("Not Weird");
        }
        return n;
    }


}
