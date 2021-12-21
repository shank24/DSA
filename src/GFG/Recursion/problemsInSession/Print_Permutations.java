package GFG.Recursion.problemsInSession;

import java.util.Scanner;

public class Print_Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scanner.nextLine();

        System.out.println("All the permutations of the String are : ");
        generatePermutation(str,0,str.length());
    }



    //Function for generating different permutations of the string
    public static void generatePermutation(String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1)
            System.out.println(str);
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                str = swapString(str,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(str,start+1,end);
                //Backtracking and swapping the characters again.
                str = swapString(str,start,i);
            }
        }
    }

    //Function for swapping the characters at position I with character at position j
    private static String swapString(String str, int i, int j) {

        if(str=="")
            return "";

        char [] ch = str.toCharArray();
        char temp;

        temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        return String.valueOf(ch);
    }
}
