package math_problems;

//Time Complexity - (Big-O(Sqrt(n)))

public class CheckPrime {
    public static void main(String[] args) {

        int number1 = GetNumber.getNumber();
        //findPrime(number1);
        System.out.println(optimizedWay(number1));

    }

    public static boolean optimizedWay(int number1) {
        boolean res=true;

        //Not Prime
        if(number1==1)
            res=false;

        //Prime
        if(number1==2 || number1==3)
            res = true;

        //Not Prime
        else if(number1%2==0 || number1%3==0)
            res=false;

        //Saving Iterations Here
        for (int i = 5; i*i<=number1 ; i=i+6) {

            if(number1%i==0 || number1%(i+2)==0) {
                res = false;
            }
        }

        if(res)
            return true;
        else
            return false;
    }


    private static void findPrime(int number1) {

        boolean res=true;

        if(number1==1)
            res=false;

        for (int i = 2; i<=Math.sqrt(number1) ; i++) {

            if(number1%i==0) {
                res = false;
                break;
            }
        }

        if(res)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is not Prime");
    }
}
