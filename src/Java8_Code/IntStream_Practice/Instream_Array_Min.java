package Java8_Code.IntStream_Practice;

import GFG.util.GetNumber;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Instream_Array_Min {

    public static void main(String[] args) {
        int range  = GetNumber.getNumber();

        int arr[] = new int[range];

        inputArray(range, arr);

        IntStream stream = Arrays.stream(arr);

        System.out.println(getMinimum(stream));

        stream.close();

    }

    private static void inputArray(int range, int[] arr) {
        for (int i = 0; i <range ; i++) {
            arr[i] = GetNumber.getNumber();
        }
    }

    private static int getMinimum(IntStream stream) {

        return stream.min().orElse(-1);
    }

}
