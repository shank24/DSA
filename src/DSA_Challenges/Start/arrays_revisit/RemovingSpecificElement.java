package DSA_Challenges.Start.arrays_revisit;

public class RemovingSpecificElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        int elem = 2;

        removeElem1(arr,elem);

    }

    private static void removeElem1(int[] arr, int elem) {

        if(arr.length==0) return;

        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=elem){
                arr[index++] = arr[i];
            }
        }

        for (int i = 0; i <index ; i++) {
            System.out.println(arr[i]);
        }
    }
}
