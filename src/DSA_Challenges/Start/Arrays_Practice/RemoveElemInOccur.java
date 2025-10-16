package DSA_Challenges.Start.Arrays_Practice;

public class RemoveElemInOccur {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3, 4, 5, 2};
        int elem = 2;
        removeElem(arr,elem);
    }

    private static void removeElem(int[] arr, int elem) {
        if(arr.length == 0)
            return;

        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=elem)
                arr[index++]=arr[i];
        }

        for (int i = 0; i <index ; i++) {
            System.out.println(arr[i]);
        }
    }
}
