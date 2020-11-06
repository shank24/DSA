package math_problems.problemsForPractice;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.*;

public class QuadraticRoots {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- >0){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = sc.nextInt();

            ArrayList<Integer> ans = quadraticRoots(a,b,c);
            if(ans.size()==1 && ans.get(0)==-1)
                System.out.println("Imaginary Roots");
            else{
                for (Integer val : ans) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

        }
    }

    private static ArrayList<Integer> quadraticRoots(int a, int b, int c) {

        double firstRoots =0 , secondRoots=0;

        ArrayList<Integer> roots =new ArrayList<>();

        int d = b * b - 4 * a * c;
        double sqrt = Math.sqrt(Math.abs(d));



        if(d>0){
            firstRoots = Math.floor((-b+sqrt)/(2*a));
            secondRoots =  Math.floor((-b-sqrt)/(2*a));

            if(secondRoots<firstRoots){
                roots.add((int) firstRoots);
                roots.add((int) secondRoots);
            }
            else{
                roots.add((int) Math.floor(secondRoots));
                roots.add((int) Math.floor(firstRoots));
            }

        }else if (d == 0){
             roots.add((-b)/(2*a));
             roots.add((-b)/(2*a));
        }else{
            roots.add(-1);
        }


        return roots;
    }
}
