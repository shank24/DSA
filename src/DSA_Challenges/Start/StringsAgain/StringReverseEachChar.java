package DSA_Challenges.Start.StringsAgain;

public class StringReverseEachChar {
    public static void main(String[] args) {
        String str = "Java is good";
        splitArrays(str);
    }


    private static void splitArrays(String str) {
        if (str.isEmpty()) return;

        String[] strArray = str.split(" ");

        reverseString(strArray);
    }

    private static void reverseString(String[] strArray) {
        //String[] arr = new String[strArray.length];

        for (int i = strArray.length-1; i >=0 ; i--) {
            String eachStr = strArray[i];
            for (int j = eachStr.length()-1; j >=0 ; j--) {
                System.out.print(eachStr.charAt(j));
            }
            System.out.print(" ");
        }
    }


}
