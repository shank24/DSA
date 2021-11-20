package GFG.Recursion.problemsInSession;

public class Recursion_Intro {

    public static void main(String[] args) {
        System.out.println("Before Fun2");
        fun2();
        System.out.println("After Fun2");

    }

    static void fun1(){
        System.out.println("Fun1");
    }

    static void fun2(){
        System.out.println("Before Fun1");
        fun1();
        System.out.println("After Fun1");
    }

}
