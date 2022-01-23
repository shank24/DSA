package Java8_Code.IntStream_Practice;

import GFG.util.GetNumber;

import java.util.stream.IntStream;

public class IntStream_Operations {
    public static void main(String[] args) {

        int n = GetNumber.getNumber();

        System.out.println(getFactorial(n));
        getSquares(n);
        getEvenNumbers(n);
        getOddNumbers(n);
        System.out.println(getMaxNumber(n));
        System.out.println(getMinNumber(n));
        System.out.println(getSum(n));


    }

    private static int getSum(int n) {
        return IntStream
                .rangeClosed(1,n)
                .reduce(Integer::sum)
                .getAsInt();

    }

    private static int getFactorial(int n) {
        return IntStream
                .rangeClosed(2,n)
                .reduce(1,(x, y)-> x*y);
    }

    private static void getSquares(int n){

          IntStream
                .rangeClosed(1,n)
                .map(i -> i*i)
                .forEach(System.out::println);
    }

    private static void getEvenNumbers(int n){
        IntStream
                .rangeClosed(1,n)
                .filter(i -> i%2==0)
                .forEach(System.out::println);
    }

    private static void getOddNumbers(int n){
        IntStream
                .rangeClosed(1,n)
                .filter(i -> i%2!=0)
                .forEach(System.out::println);
    }

    private static int getMaxNumber(int n){
        return IntStream
                .rangeClosed(1,n)
                .max()
                .orElse(-1);
    }

    private static int getMinNumber(int n){
        return IntStream
                .rangeClosed(1,n)
                .min()
                .orElse(-1);
    }
}
