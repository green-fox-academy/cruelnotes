import java.util.Scanner;

public class Sum {
    //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Input a number until when the program should sum the numbers.");
        int sumUntil = userInput.nextInt();

        System.out.println(sum(sumUntil));
    }

    public static int sum(int top) {
        int container = 0;
            for (int i = 0; i <=  top; i++) {
                container += i;
            }
        return container;
    }

}
