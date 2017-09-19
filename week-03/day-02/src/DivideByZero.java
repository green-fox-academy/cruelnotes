import java.util.Scanner;

public class WriteSingleLine {
// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0


    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please input an integer: ");
        int userInput =   intScanner.nextInt(System.in);

        System.out.println(divisionByTen(userInput));



    }

    private static int divisionByTen(int userInput) {
    }
}