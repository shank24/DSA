package Java8_Code.Interview_Questions;
import java.math.BigInteger;


public class IsPrimeBigInteger {

    public static final int NTH_PRIME=100;

    public static void main(String[] args) {

        BigInteger TWO = new BigInteger("2");
        BigInteger bi = new BigInteger("1");

        System.out.println("2");

        int i=1;

        long startTime = System.currentTimeMillis();

        while (i<NTH_PRIME){
            bi = bi.add(TWO);
            if(bi.isProbablePrime(5)){
                i++;
                System.out.println(bi);
            }
        }

        System.out.println("The " + NTH_PRIME + "th prime number is " + bi);
        System.out.println("Time to Calc " + (System.currentTimeMillis()-startTime) + " milli_seconds");

    }
}
