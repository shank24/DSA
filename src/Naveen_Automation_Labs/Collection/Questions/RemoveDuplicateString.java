package Naveen_Automation_Labs.Collection.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("java","python","java"));

        //1. LinkedHashSet
        Set<String> uniqueSet = new LinkedHashSet<>(strings);

        List<String> stringsWithoutDuplicate = new ArrayList<>(uniqueSet);

        System.out.println(strings);
        System.out.println(stringsWithoutDuplicate);

        //JDK 8
        List<String> strings1 = new ArrayList<>(Arrays.asList("java","python","java"));

        List<String> uniqueStrings1 = strings1.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueStrings1);

    }
}
