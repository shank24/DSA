package DSA_Challenges.Start.basic;

public class BiggestThreeOfAllNumbers {
    public static void main(String[] args) {

        int a =1, b=2, c =3;
        System.out.println(findBigNumber(a,b,c));
    }

    private static int findBigNumber(int a, int b, int c) {
        return Math.max(a, (Math.max(b, c)));
    }
}
