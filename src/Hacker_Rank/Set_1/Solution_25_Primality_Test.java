package Hacker_Rank.Set_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution_25_Primality_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger number = new BigInteger(n);
        boolean result = number.isProbablePrime(10);
        System.out.println(result);
        if(result)
            System.out.println("prime");
        else
            System.out.println("not prime");
        bufferedReader.close();
}


}
