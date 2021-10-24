package Java8_Code.Interview_Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_Duplicate {
    public static void main(String[] args) {

        Integer[] arr = new Integer[] {1,2,3,4,5,5};
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> setOfList = list.stream()
                                    .collect(Collectors.toSet());

        System.out.println(setOfList);
    }
}
