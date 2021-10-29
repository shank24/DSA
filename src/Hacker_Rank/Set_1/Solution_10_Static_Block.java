package Hacker_Rank.Set_1;


public class Solution_10_Static_Block {

    static int B;
    static int H;
    static {
            B=1;
            H=-3;
    }

    public static void main(String[] args) {

        boolean flag = true;

        try {
            if(B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
            else{
                System.out.println(B*H);
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

    }

}
