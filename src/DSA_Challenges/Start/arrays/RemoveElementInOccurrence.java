package DSA_Challenges.Start.arrays;

public class RemoveElementInOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 3, 4, 5, 2};
        int elem = 2;
        removeElementInOccur(arr, elem);
    }

    private static void removeElementInOccur(int[] arr, int elem) {
        if (arr.length <= 1)
            return;

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elem) {
                arr[index++] = arr[i];
            }
        }
        for (int i = 0; i <index ; i++) {
            System.out.println(arr[i]);
        }

    }
}
