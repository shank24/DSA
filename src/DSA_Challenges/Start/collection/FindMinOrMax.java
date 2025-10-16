package DSA_Challenges.Start.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinOrMax {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        int[] arr = new int[]{1,2,3,4,5};

        List<String> strList = new ArrayList<>(Arrays.asList("A","B","C"));
        String[] str = strList.toArray(new String[0]);
        for(String s:str) 
            System.out.println(s);

    }
}
