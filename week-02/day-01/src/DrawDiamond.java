import java.util.Scanner;

public class DrawDiamond {

// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide the number of levels: ");
        int rowNumber = myScanner.nextInt();


        for(int i = 1, k = 0; i <= rowNumber; ++i, k = 0) {
            for(int empty = 1; empty <= rowNumber - i; ++empty) {
                System.out.print(" ");
            }

            while(k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }
    }
}
