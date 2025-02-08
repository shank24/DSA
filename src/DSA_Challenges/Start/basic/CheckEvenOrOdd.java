package DSA_Challenges.Start.basic;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int num = 50;
        System.out.println(checkNumber(num));
    }

    private static String checkNumber(int num) {

        if(num%2==0)
            return "Even";
        else
            return "Odd";
    }
}
