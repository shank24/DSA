package Hacker_Rank.Set_1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution_13_Currency_Formatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale inrLocale = new Locale("en","IN");

        NumberFormat us = getNumberFormat(Locale.US);
        NumberFormat china = getNumberFormat(Locale.CHINA);
        NumberFormat france = getNumberFormat(Locale.FRANCE);
        NumberFormat india = NumberFormat.getCurrencyInstance(inrLocale);


        printResult(payment, us, "US: ");
        printResult(payment, india, "India: ");
        printResult(payment, china, "China: ");
        printResult(payment, france, "France: ");
    }

    private static void printResult(double payment, NumberFormat numberFormat, String s) {
        System.out.println(s + numberFormat.format(payment));
    }

    private static NumberFormat getNumberFormat(Locale type) {
        return NumberFormat.getCurrencyInstance(type);
    }

}
