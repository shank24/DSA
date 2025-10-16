package Neutrino.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {

        String phoneNumber = "12.123.356.8957";
        /* (\d{1,2}) - To exclude . from the pattern
        - (\d{1,2})[.-]?) : group 1
        - (\d{1,2}) : group 2
         */

        // ?: - Not to capture the bigger group.
        // ?<countryCode> - it is a group name which we can refer later.


        String regex = """
                # This is my regex to parse the parts of a phoneNum
                (?:(?<countryCode>\\d{1,2})[.-]?) # Get's country code
                (?:(?<areaCode>\\d{3})[.-]*) # Get's area code
                (?:(?<exchange>\\d{3})[.-]*) # Get's exchange  
                (?<lineNumber>\\d{4}) # Get's line number
                """;

        //System.out.println(phoneNumber.matches(regex));
        Pattern phoneNumPat = Pattern.compile(regex,Pattern.COMMENTS);
        Matcher mat = phoneNumPat.matcher(phoneNumber);

        if (mat.matches()) {
            System.out.println("Country code " + mat.group("countryCode"));
            System.out.println("Area code  : " + mat.group("areaCode"));
            //System.out.println(mat.group(3));
            System.out.println("Exchange : " + mat.group("exchange"));
            //System.out.println(mat.group(5));
            System.out.println("Line Number  : " + mat.group("lineNumber"));
            //System.out.println("Line Number  : " + mat.group(7));
            System.out.println(mat.group(0));

        } else
            System.out.println("Not Matching");
    }
}
