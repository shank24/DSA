package DSA_Challenges.Start.arrays;

public class Code {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers("abc123xyz05def002"));
    }

    private static int sumOfNumbers(String strObject){


        StringBuilder extractingDigits = new StringBuilder();

        for(char ch: strObject.toCharArray()){
            if(Character.isDigit(ch)){
                extractingDigits.append(ch);
            }
        }

        System.out.println(extractingDigits.length());
        String value1 = extractingDigits.substring(0,3);
        String value2 = extractingDigits.substring(3,5);
        String value3 = extractingDigits.substring(5,extractingDigits.length());

        int sum = Integer.parseInt(value1) + Integer.parseInt(value2) + Integer.parseInt(value3);
        return sum;
    }
}
