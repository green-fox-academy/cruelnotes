import java.util.Scanner;

public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide an input number: ");
        int level = myScanner.nextInt();

        String aster = "*";
        String empty = " ";

        String cont = "*;


        for (int i = 0; i < level; i++  ) {
            System.out.println(cont);

        }

    }
}
