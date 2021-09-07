package math_problems.problemsForPractice;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T>0){
            int num = sc.nextInt();
            System.out.println(returnAbsolute(num));
            T--;
        }
    }

    private static int returnAbsolute(int num) {
        if(num<=0)
            return num*(-1);
        else
            return num;
    }
}
