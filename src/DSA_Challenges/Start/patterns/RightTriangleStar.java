package DSA_Challenges.Start.patterns;

public class RightTriangleStar {
    public static void main(String[] args) {
        int n = 5;
        rightSide(n);
        leftSide(n);
    }

    private static void leftSide(int n) {
        int a, b;

        // 1st loop
        for (a = 0; a < n; a++) {

            // nested 2nd loop
            for (b = 2 * (n - a); b >= 0; b--) {
                // printing spaces
                System.out.print(" ");
            }

            // nested 3rd loop
            for (b = 0; b <= a; b++) {
                // printing stars
                System.out.print("* ");
            }

            // end-line
            System.out.println();
        }
    }

    private static void rightSide(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
