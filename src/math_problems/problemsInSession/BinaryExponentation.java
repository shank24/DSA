package math_problems.problemsInSession;

//TC - O(log(n))
//Aux Space - 1

public class BinaryExponentation {
    public static void main(String[] args) {

        int number = GetNumber.getNumber();
        int power = GetNumber.getNumber();

        System.out.println(binaryExpo(number,power));
        System.out.println(binaryExpoUsingBitWiseAndShift(number,power));
    }

    private static int binaryExpo(int number, int power) {

            int res = 1;

            while (power>0){


                if(power%2!=0){
                    res = res*number;
                }
                number = number*number;
                power/=2;
            }
            return res;
    }

    private static int binaryExpoUsingBitWiseAndShift(int number, int power) {

        int res = 1;

        while (power>0){


            if(power%2!=0){
                res = res*number;
            }
            number = number*number;
            power = power>>1;
        }
        return res;
    }
}
