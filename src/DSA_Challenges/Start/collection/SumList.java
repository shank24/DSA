package DSA_Challenges.Start.collection;

import java.util.ArrayList;
import java.util.List;

public class SumList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        getSumOfIntegerList(integerList);
    }

    private static void getSumOfIntegerList(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum = sum + integerList.get(i);
        }
        System.out.println(sum);
    }
}
