package math_problems.problemsForPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModuloMultiply {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //taking Testcases

        int t = Integer.parseInt(read.readLine());

        while (t-- >0){
            String[] str = read.readLine().trim().split(" ");

            //taking input a & b
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);

            //calling method
            System.out.println(sumUnderModulo(a,b));
        }
    }

    private static long sumUnderModulo(Long a, Long b) {

        long M = (long) Math.pow(10,9) + 7;
        long c = a%M;
        long d = b%M;

        return ((c)*(d))%M;
    }
}
