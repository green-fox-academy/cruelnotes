import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumberToGuess = rand.nextInt(100);
        System.out.println(randomNumberToGuess);



        Scanner guessScanner = new Scanner(System.in);
        System.out.println("Random number between 0 and 100 were generated...");
        System.out.println("Guess the number: ");
        int userGuess = guessScanner.nextInt();

        while (true) {

            if (userGuess < randomNumberToGuess) {
                System.out.println("The stored number is higher.");
                System.out.println("Guess again: ");
                userGuess = guessScanner.nextInt();

            } else if (userGuess > randomNumberToGuess) {
                System.out.println("The stored number is lower.");
                System.out.println("Guess again: ");
                userGuess = guessScanner.nextInt();

            } else  {
                System.out.println("You found the number: " + randomNumberToGuess);
                break;
                
            }
        }
    }
}
