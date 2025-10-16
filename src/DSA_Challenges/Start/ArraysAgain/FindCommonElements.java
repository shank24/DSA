package DSA_Challenges.Start.ArraysAgain;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 4, 3};

        String[] str1 = new String[]{"A","B","D","C"};
        String[] str2 = new String[]{"A","B","C","D"};

        findCommon(arr1, arr2);
        findCommonString(str1,str2);
    }

    private static void findCommonString(String[] str1, String[] str2) {
        Set<String> strSet = new HashSet<>();

        for (int i = 0; i <str1.length ; i++) {
            for (int j = 0; j <str2.length ; j++) {
                if(str1[i].equals(str2[j])){
                    strSet.add(str1[i]);
                    break;
                }
            }
        }
        System.out.println(strSet);
    }

    private static void findCommon(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        for (int i : arr2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
