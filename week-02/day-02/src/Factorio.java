import java.util.Scanner;

public class Factorio {
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Input a number to get back it's factorial!");
        int facInput = userInput.nextInt();

        System.out.println(factorio(facInput));

    }

    public static int factorio(int x) {
        int factorial = 1;
            for (int i = 1; i <= x + 1; i++) {
                factorial *= i;

            }
        return factorial;
    }
}
