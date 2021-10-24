package GFG.Java8_Code.IntStream_Practice;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStream_Multiply {
    public static void main(String[] args) {

        IntStream stream = IntStream.of(1,2,3,4,5,6);
        System.out.println(multipleOperation(stream));
    }

    private static int multipleOperation(IntStream stream) {

        OptionalInt answer  = stream.reduce((a, b) -> a*b );

        if (answer.isPresent()) {
            return answer.getAsInt();
        }
        else {
            return 0;
        }

    }
}
