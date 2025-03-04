package Java8_Code.IntStream_Practice;

import GFG.util.GetNumber;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Instream_Array_Max1 {

    public static void main(String[] args) {
        int range = GetNumber.getNumber();

        int arr[] = new int[range];
        inputArray(range, arr);
        IntStream stream = Arrays.stream(arr);
        System.out.println(stream.max().orElse(-1));
        stream.close();

    }

    private static int getMaximum(IntStream stream) {
        return stream.max().orElse(-1);
    }

    private static void inputArray(int range, int[] arr) {
        for (int i = 0; i < range ; i++) {
            arr[i] = GetNumber.getNumber();
        }
    }
}
