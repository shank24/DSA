package math_problems.problemsInSession;

// Time Complexity of min(a,b)

public class GCF {
    public static void main(String[] args) {

        int number1 = GetNumber.getNumber();
        int number2 = GetNumber.getNumber();

        System.out.println(findGCF(number1,number2));
        //System.out.println(basicEuclidenaAlgo(number1,number2));
        //System.out.println(optimizedEuclideanAlgo(number1,number2));

    }

    private static int optimizedEuclideanAlgo(int number1, int number2) {
        if(number2==0)
            return number1;
        else
            return optimizedEuclideanAlgo(number2,number1%number2);
    }

    private static int basicEuclidenaAlgo(int number1, int number2) {

        while (number1!=number2){
            if(number1>number2)
                number1=number1-number2;
            else
                 number2=number2-number1;
        }
        return number1;
    }

    private static int findGCF(int number1, int number2) {

        int res = Math.min(number1,number2);

        while (res>0){
            if(number1%res==0 && number2%res==0){
                break;
            }
            res--;
        }
        return res;

    }
}
