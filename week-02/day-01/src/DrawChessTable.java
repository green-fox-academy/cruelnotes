import java.util.Scanner;

public class DrawChessTable {

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//


        public static void main(String[] args) {

            String modulus = "%";
            String empty = " ";

            for (int i = 0; i < 8; ++i) {

                System.out.println("\r\n");

                if (i % 2 == 0) {
                    for (int j = 0; j < 5; ++j)
                        System.out.print(modulus + empty);
                } else {
                    for (int j = 0; j < 5; ++j)
                        System.out.print(empty + modulus);

                }
            }
        }
}
