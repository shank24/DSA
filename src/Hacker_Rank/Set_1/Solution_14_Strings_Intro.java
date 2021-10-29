package Hacker_Rank.Set_1;

import java.util.Scanner;

public class Solution_14_Strings_Intro {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int length = getLength(A,B);
        System.out.println(length);
        System.out.println(compareStrings(A,B));
        System.out.println(capitalizeStrings(A,B));

    }

    private static String capitalizeStrings(String a, String b) {
        return a.substring(0,1).toUpperCase()+a.substring(1,a.length())+ " " + b.substring(0,1).toUpperCase()+b.substring(1,b.length());
    }

    private static String compareStrings(String a, String b) {
        String res="";

        if(a.compareTo(b)>1){
            res="Yes";
        }
        else if(a.compareTo(b)<1){
            res="No";
        }

        return res;
    }

    private static int getLength(String a, String b) {
        return a.length()+b.length();
    }
}
