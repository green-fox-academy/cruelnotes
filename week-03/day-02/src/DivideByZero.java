import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0


    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please input an integer: ");
        int userInput = intScanner.nextInt();

        tenDividedBy(userInput);
    }

    private static void tenDividedBy(int userInput) {
        try {
            System.out.println(10 / userInput);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }

}