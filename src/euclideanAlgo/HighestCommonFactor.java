package euclideanAlgo;

/**
   Find the Greatest common divisor of two numbers
 */
public class HighestCommonFactor {

    public static void main(String[] args) {

        int a = 12;
        int b = 50;
        int highestCommonFactor = findHighestCommonFactor(a,b);
        System.out.println("Highest common factor of "+a+" & "+b+" is "+ highestCommonFactor);


    }

    private static int findHighestCommonFactor(int a, int b){
        if (a < b){
            b = a + b;
            a = b - a;
            b = b - a;
        }

        if (b == 0){
            return a;
        }
        else {
            return findHighestCommonFactor(b, a % b);
        }
    }
}
