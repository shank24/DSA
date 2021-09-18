package Hacker_Rank.Set_1;

import java.util.Scanner;

public class Solution_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        int a[] = new int[lines];
        int b[] = new int[lines];
        int n[] = new int[lines];

        for (int i = 0; i < lines; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            n[i] = sc.nextInt();
        }

        //outer loop - lines
        for (int i = 0; i < lines; i++){
            //second loop - n
            for (int j = 0; j < n[i]; j++){
                //interior loop
                int sum = a[i];
                for (int k = 0; k <= j; k++){
                    sum += Math.pow(2, k) * b[i];
                }
                System.out.print(sum + " ");
            }
            System.out.println("");
        }
        sc.close();
    }

}
