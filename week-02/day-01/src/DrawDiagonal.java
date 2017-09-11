import java.util.Scanner;


public class DrawDiagonal {

    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was

    public static void main(String[] args) {


        Scanner diagonalScanner = new Scanner(System.in);
        System.out.println("please provide the size of the diagonal");
        int dimension = diagonalScanner.nextInt()-1;

        String modulo = "%";
        String bodyContainer = "";
        String empty = " ";
        String lineX = "";

        // Top vertical line
        for (int i = 0; i < dimension + 2; i++) {
            lineX = lineX + modulo;
            if (i == dimension) {
                System.out.println(lineX);
            }
        }

        //Body
        for (int j = 0; j < dimension - 2; j++) {
            bodyContainer = "";
            for (int k = 0; k < dimension + 1; k++) {

                if (k == 0) {
                    bodyContainer = bodyContainer + modulo;
                } else if (k == dimension) {
                    bodyContainer = bodyContainer + modulo;
                } else if (k == j + 1) {
                    bodyContainer = bodyContainer + modulo;
                } else {
                    bodyContainer = bodyContainer + empty;
                }

            }
            System.out.println(bodyContainer);

        }

        // Bottom vertical line
        System.out.println(lineX);

        }




    }


