package Neutrino.Regex;

public class RegexPractice1 {
    public static void main(String[] args) {
        //. - matches any character
        System.out.println("dog".matches(".*"));
        // ^  -Beginning & $ - Ending
        System.out.println("dog".matches("^...$"));
        // \\s - space & \\b - boundary
        System.out.println("cat dog".matches("...\\s\\b..."));
        // \\W - matches Non Word characters
        System.out.println("---".matches("\\W\\W\\W"));
        // \\D - matches Non Digit numbers
        System.out.println("abc".matches("\\D\\D\\D"));
        // \\S - matches Non Space
        System.out.println("a".matches("\\S"));



    }
}
