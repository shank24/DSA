package Naveen_Automation_Labs.Collection.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateInteger {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,1,2,1,23,3,8));

        //1. LinkedHashSet
        Set<Integer> uniqueSet = new LinkedHashSet<>(numbers);

        List<Integer> numbersWithoutDuplicate = new ArrayList<>(uniqueSet);

        System.out.println(numbers);
        System.out.println(numbersWithoutDuplicate);

        //JDK 8
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(22,1,2,1,2,1,23,3,8));

        List<Integer> uniqueNumbers = numbers1.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);

    }
}
