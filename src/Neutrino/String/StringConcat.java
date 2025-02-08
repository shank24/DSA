package Neutrino.String;

public class StringConcat {
    public static void main(String[] args) {
        String text1 = "abc";
        String text2 = "def";
        System.out.println(text1.concat(text2));

        String sb = new StringBuilder()
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(sb);

        String sb1 = new StringBuffer()
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(sb1);

        System.out.format("%s %s", text1 , text2);
    }
}
