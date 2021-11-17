package Naveen_Automation_Labs;

public class PrintOneToHundred {

    public static void main(String[] args) {

        int one = 'A'/'A';
        String s1 = "..........";

        //Naive Solution
        for (int i = one; i <=(s1.length()*s1.length()); i++) {
            System.out.println(i);
        }


        //Ascii Way
        for (int i = one; i <='d' ; i+=one) {
            System.out.println(i);
        }

        //Other way
        String s = "programmin";

        int zero = s.length()-s.length();
        int hundred = s.length() * s.length();
        for(int i = zero; i<=hundred; i++) {
            System.out.println(i);
        }

    }
}
