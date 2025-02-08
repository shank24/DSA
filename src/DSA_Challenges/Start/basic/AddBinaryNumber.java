package DSA_Challenges.Start.basic;

public class AddBinaryNumber {
    public static void main(String[] args) {
        String x = "10", y = "10    ";
        add_Binary(x,y);
    }

    private static void add_Binary(String x, String y) {
        int num1 = Integer.parseInt(x,2);
        int num2 = Integer.parseInt(y,2);

        int sum = num1+num2;
        String result = Integer.toBinaryString(sum);

        System.out.println(result);
    }
}
