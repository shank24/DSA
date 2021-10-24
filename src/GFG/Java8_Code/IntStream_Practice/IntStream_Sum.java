package GFG.Java8_Code.IntStream_Practice;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStream_Sum {

    public static void main(String[] args) {

        IntStream stream = IntStream.of(1,2,3,4,5,6);

        System.out.println(sumOperation(stream));
    }



    private static int sumOperation(IntStream stream) {
        OptionalInt answer  = stream.reduce(Integer::sum);


        if (answer.isPresent()) {
            return answer.getAsInt();
        }
        else {
            return 0;
        }
    }
}
