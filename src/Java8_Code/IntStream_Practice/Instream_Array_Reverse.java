package Java8_Code.IntStream_Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Instream_Array_Reverse {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        getReverseInt(list);
        System.out.println(list);

    }

    private static void getReverseInt(List<Integer> list) {
        list.sort(Collections.reverseOrder());
    }

}
