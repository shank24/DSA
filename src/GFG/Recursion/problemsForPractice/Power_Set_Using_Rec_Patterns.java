package GFG.Recursion.problemsForPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Power_Set_Using_Rec_Patterns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String");

        String s = scanner.next();
        System.out.println(keypad(s));
    }

    public static List<String> keypad(String str){
        String[] ans= fun(str);
        Arrays.sort(ans);
        return Arrays.asList(ans);
    }


    public static String[] fun(String s){
        if(s.length()==0){
            return new String[]{" "};
        }

        String smallAns[] = fun(s.substring(1));
        String ans[]= new String[2*smallAns.length];

        int k =0;

        for (int i = 0; i <smallAns.length ; i++) {
            ans[k] = s.charAt(0) + smallAns[i];
            k++;
        }

        for (int i = 0; i < smallAns.length; i++) {
            ans[k] = smallAns[i];
            k++;
        }

        return ans;
    }


}
