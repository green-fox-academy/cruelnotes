import java.util.Scanner;

public class DrawTriangle {

    // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide an input number: ");
        int inputNumber = myScanner.nextInt();

        String asterix = "*";
        String container = "*";

        for (int i = 0; i < inputNumber; i++  ) {
            System.out.println(container);
            container = container + asterix;
        }

    }
}
