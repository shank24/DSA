package DSA_Challenges.Start.strings;

public class InsertString {
    public static void main(String[] args) {
        String oldString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;

        insertStringAtSpecificIndex(oldString,stringToBeInserted,index);
    }

    private static void insertStringAtSpecificIndex(String oldString, String stringToBeInserted, int index) {

        if(oldString.isEmpty())
            return;

        String laterStringPart = oldString.substring(index+1);
        //String finalString = oldString.substring(0,index+1).concat(stringToBeInserted).concat(laterStringPart);
        String finalString = oldString.substring(0,index+1).concat(stringToBeInserted)+oldString.substring(index+1);
        System.out.println("Final String : " + finalString);

    }
}
