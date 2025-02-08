package Neutrino.String;

public class LearnStrings {
    public static void main(String[] args) {
        lengthOfString();
        containsTextInString();
        compareStringAlphabetically();
        charAtText();
        splitText();
        trimText();
        replaceText();
        blankCheck();
        caseCheck();
        checkString();
    }

    private static void lengthOfString() {
        String text = "Testing";
        System.out.println(text.length());

        char[] chars=text.toCharArray();
        System.out.println(chars[2]);
    }

    private static void containsTextInString() {
        String sentence = "Canada is big country";
        String searchText = "big";

        System.out.println(sentence.contains(searchText));
    }

    private static void compareStringAlphabetically() {
        String firstWord = "Apple";
        String secondWord = "Chiku";

        //System.out.println(firstWord.compareTo(secondWord));
        System.out.println(compareToIgnoreCase("apple","Apple"));
    }

    public static int compareToIgnoreCase(String text1, String text2){

        String t1 = text1.toLowerCase();
        String t2 = text2.toLowerCase();

        return t1.compareTo(t2);
    }

    private static void charAtText() {
        String text = "Apple";
        System.out.println(text.charAt(3));
    }

    private static void splitText() {
        String text = "A good boy";
        String[] arr = text.split(" ");
        for (String s: arr)
            System.out.println(s);
    }

    private static void trimText() {
        String fName = " Raj-Kiran ";
        System.out.println(fName.trim());
    }


    private static void replaceText() {
        String myText = "America is good";
        System.out.println(myText);
        myText = myText.replace('e','o');
        myText = myText.replace("good", "better");
        System.out.println(myText);
    }

    private static void blankCheck() {
        String myText = "a";
        System.out.println(myText.isEmpty());
        System.out.println(myText.isBlank());
    }

    private static void caseCheck() {
        String myText = "abcdefgh";
        System.out.println(myText.toUpperCase());

        String myText1 = "ABCDEFGH";
        System.out.println(myText.toLowerCase());
    }

    private static void checkString() {
        String fruit = "apple";
        String anotherFruit = "apple";

        String veg = new String("loki");
        String anotherVeg = new String("loki");

        System.out.println(fruit == anotherFruit);
        System.out.println(veg == anotherVeg);
    }
}