package Hacker_Rank.Set_1;

import java.util.Scanner;

public class Solution_5_Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("'%-15s'%03d%n", s1,x);

            /*
            %s - string
            %d - decimal
            %n - New Line
            %f - floating points
             */

        }
        System.out.println("================================");
        System.out.printf("baeldung%nline%nterminator%n");
        System.out.printf("'%S' %n", "baeldung");
    }

}
