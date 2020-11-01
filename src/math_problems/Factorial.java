package math_problems;

public class Factorial {
    public static void main(String[] args) {

        int number = GetNumber.getNumber();
        //System.out.println(findFactorial(number));
        System.out.println(recursiveMethod(number));

    }

    private static int recursiveMethod(int number) {
        if(number==0)
            return 1;
        return number*recursiveMethod(number-1);
    }

    private static int findFactorial(int number) {
        int fact = 1;

        if(number==0 || number==1)
            return 1;

        for (int i = 2; i <=number ; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
