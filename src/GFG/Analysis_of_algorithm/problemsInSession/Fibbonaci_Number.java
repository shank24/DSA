package GFG.Analysis_of_algorithm.problemsInSession;

import GFG.Math_problems.problemsInSession.GetNumber;

public class Fibbonaci_Number {

    public static void main(String[] args) {
        int n = GetNumber.getNumber();

        int result = recursiveWay(n);
        System.out.println(result);
        System.out.println(iterativeWay(n));
        System.out.println(iterativeWayOptimize(n));



    }

    private static int iterativeWayOptimize(int n) {
        if(n==0 || n==1)
            return n;
        int a=0, b=1, c=0;
        for (int i = 2; i <=n ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    //Space Comp - Theta(1) (Because of constant variable,
    // not depending upon n.
    //Time Comp - Theta(n) for all.


    private static int iterativeWay(int n) {
        int f[] = new int[n+1];

        f[0]=0;
        f[1]=1;

        for (int i = 2; i <=n; i++) {
                f[i] = f[i-1]  + f[i-2];
        }
        return f[n];
    }
    //Space Comp - Theta(n)

    private static int recursiveWay(int n) {
        if(n==0 || n==1)
            return n;
        return recursiveWay(n-1)+recursiveWay(n-2);
    }
    //Space Comp - Theta(n)


}
