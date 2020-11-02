package math_problems;


//Time Complexity - (BigO((a*b) - max(a,b)))
//Time Complexity - (BigO(log(min(a,b)))



public class LCM {
    public static void main(String[] args) {

        int number1 = GetNumber.getNumber();
        int number2 = GetNumber.getNumber();

        System.out.println(findLCM(number1,number2));
        System.out.println(optimizedMethod(number1,number2));
    }

    private static int optimizedMethod(int number1, int number2) {
        return (number1*number2)/gcd(number1,number2);
    }

    private static int gcd(int number1, int number2){
        if(number2==0)
            return number1;

        return gcd(number2,number1%number2);
    }

    private static int findLCM(int number1, int number2) {

        int res = Math.max(number1,number2);

        while (true){
            if(res%number1==0 && res%number2==0){
                return res;
            }
            res++;
        }

    }
}
