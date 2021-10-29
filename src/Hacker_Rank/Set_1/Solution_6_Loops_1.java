package Hacker_Rank.Set_1;

import java.util.Scanner;

public class Solution_6_Loops_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d= %d%n",n,i,n*i);
        }
        sc.close();
    }

}
