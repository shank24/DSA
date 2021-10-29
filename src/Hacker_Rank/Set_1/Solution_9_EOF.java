package Hacker_Rank.Set_1;

import java.util.Scanner;

public class Solution_9_EOF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Default Delimiter of Scanner - /n
        //sc.useDelimiter("/n");

        int count=1;
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(count + " " + sc);
            count++;
        }
    }

}

/*
hasNext() - Returns true if this scanner has another token in its input.
This method may block while waiting for input to scan.
The scanner does not advance past any input.

nextLine() - Advances this scanner past the current line and returns the input that was skipped.
This method returns the rest of the current line, excluding any line separator at the end.
The position is set to the beginning of the next line.
Since this method continues to search through the input looking for a line separator,
it may buffer all of the input searching for the line to skip if no line separators are present.


Scanner - A simple text scanner which can parse primitive types and strings using regular expressions.
A Scanner breaks its input into tokens using a delimiter pattern,
which by default matches whitespace.
The resulting tokens may then be converted into values
of different types using the various next methods.


 */