import java.math.BigInteger;

public class Big {

    //Using a For Loop, write an iterative version
    public static BigInteger factorial(int n) {
        //Covert with BigIntegers and return a BigInteger as a return
        if (n < 0)
            throw new IllegalArgumentException("Illegal: Factorial is not defined for negative numbers.");

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    //Here you can answer the first question

    //Display 0 - 30
    public static void displayFactorialTable(int n) {
        //Insert a tab space
        System.out.println("n\tFactorial");
        System.out.println("-------------------");
        for (int i = 0; i <= n; i++) {
            System.out.println(i + "\t" + factorial(i));
        }
    }
    public static void main(String[] args) {
        //Display the table
        displayFactorialTable(30);
    }

}
