package GFG.Recursion.problemsInSession;

import java.util.Scanner;

public class Palindrome_String_Rec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String");

        String s = scanner.next();

        System.out.println(checkPalindromeString(s));
        System.out.println(checkRec(s,0,s.length()-1));

    }

    private static boolean checkRec(String s, int start, int end) {

        if(start>=end)
            return true;

        return (s.charAt(start)==s.charAt(end)
                &&
                checkRec(s,start+1,end-1));
    }

    private static boolean checkPalindromeString(String s) {

        if(s.length()==0)
            return false;

        int i=0, j=s.length()-1;

        while (i<j/2){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }


}
