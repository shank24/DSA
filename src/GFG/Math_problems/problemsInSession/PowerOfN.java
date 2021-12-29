package GFG.Math_problems.problemsInSession;

//TC - Theta(N)
//TC - Theta(Log(n)) + Big(O(1))- optimizedSol + Auxillary Space for Recursion.

import GFG.util.GetNumber;

public class PowerOfN {
    public static void main(String[] args) {

        int number = GetNumber.getNumber();
        int power = GetNumber.getNumber();

        //System.out.println(findNToThePower(number,power));
        System.out.println(optimizedSolution(number,power));
        System.out.println(iterativeWay(number,power));
    }

    private static int iterativeWay(int n, int power) {
        int res=1;

        while (power>0){
            //(power&1)
            if(power%2!=0){
                res = res*n;
            }
            n=n*n;
            //power=power>>1
            power=power/2;
        }
        return res;
    }

    //Recursive Way
    private static int optimizedSolution(int number, int power) {

        if(power==0)
            return 1;

        int temp = optimizedSolution(number,power/2);
        temp = temp*temp;

        if(power%2==0)
            return temp;
        else
            return temp*number;
    }

    //Naive Solution
    private static int findNToThePower(int n, int p) {
        int res=1;

        if(p<=0){
            return res;
        }

        if(p==1){
            return n;
        }

        for (int i = 1; i <=p ; i++) {
            res=res*n;
        }
        return res;
    }

    //Iterative Way

}
