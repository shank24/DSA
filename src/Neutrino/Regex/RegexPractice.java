package Neutrino.Regex;

public class RegexPractice {
    public static void main(String[] args) {
        //Expecting all character except c
        System.out.println("Cat".matches("[^c]at"));

        System.out.println("Cat".matches("[a-zA-Z]at"));
        //Expect a 3 letter word , where w is the first char and then "at"
        System.out.println("1at".matches("\\wat"));

        //Match 3 letter word
        System.out.println("1at".matches("\\w\\w\\w"));

        //Match 1 number
        System.out.println("1".matches("\\d"));

        //Lazy Way
        System.out.println("123-958-2514".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));

        //With Quantifiers
        System.out.println("123-958-2514".matches("\\d{3}-\\d{3}-\\d{4}"));

        //With Quantifiers - match "-" Or "."
        System.out.println("123.958.2514".matches("\\d{3}[.-]\\d{3}[.-]\\d{4}"));

        //With Quantifiers - match "one or more of those char in []"
        System.out.println("123..958.2514".matches("\\d{3}[.-]+\\d{3}[.-]+\\d{4}"));

        //With Quantifiers - match "zero or more of those char in []"
        System.out.println("123.9582514".matches("\\d{3}[.-]*\\d{3}[.-]*\\d{4}"));

        //With Quantifiers - match "zero or one of those char in []"
        System.out.println("123.9582514".matches("\\d{3}[.-]?\\d{3}[.-]?\\d{4}"));

        //With Quantifiers - match the last set of digit in 3 or 4 //d{3,4}"
        System.out.println("123.958.2514".matches("\\d{3}[.-]*\\d{3}[.-]*\\d{3,4}"));

        //With Quantifiers - match the last set of digit in 3 or upper limit //d{3,}"
        System.out.println("123.958.251466666".matches("\\d{3}[.-]*\\d{3}[.-]*\\d{3,}"));

        //With Quantifiers - grouping the first set of pattern and using for another one - (\d{3}[.-]?){2} - matching the pattern 2 times.
        System.out.println("123.958.2514".matches("(\\d{3}[.-]?){2}\\d{3,4}"));

        //With Quantifiers - grouping the first set of pattern and using for another one - (\d{3}[.-]?){1,2} - matching the pattern 1 or 2  times.
        System.out.println("958.2514".matches("(\\d{3}[.-]?){1,2}\\d{3,4}"));

        //With Quantifiers - grouping the first set of pattern and using for another one - (\d{1,3}[.-]?){1,3} - matching the pattern 1.123.124  times.
        System.out.println("136.123.958.2514".matches("(\\d{1,3}[.-]?){1,3}\\d{3,4}"));

    }
}
