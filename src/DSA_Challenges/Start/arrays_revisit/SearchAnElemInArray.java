package DSA_Challenges.Start.arrays_revisit;

public class SearchAnElemInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,34,56};
        int elem = 21;
        boolean status = findElem(arr,elem);
        System.out.println(status);
    }

    private static boolean findElem(int[] arr, int elem) {

        boolean res = false;

        for (int i = 0; i < arr.length; i++) {
            if(elem == arr[i]){
                res = true;
                break;
            }
        }

        return res;
    }
}
