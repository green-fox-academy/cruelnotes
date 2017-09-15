import java.util.Random;
import java.util.Scanner;

public class guessMyNumber {

    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumberToGuess = rand.nextInt(100);
        System.out.println(randomNumberToGuess);

        int lives = 5;

        Scanner guessScanner = new Scanner(System.in);
        System.out.println("I've the number between 1-100. You have " + lives + " lives.");
        System.out.println("Guess the number: ");
        int userGuess = guessScanner.nextInt();

        while (lives != 0) {

            System.out.println("");

            if (userGuess < randomNumberToGuess) {
                System.out.println("Too low. You have " + (lives -1 ) + " lives.");
                System.out.println("Guess again: ");
                userGuess = guessScanner.nextInt();
                lives--;

            } else if (userGuess > randomNumberToGuess) {
                System.out.println("Too high. You have " + (lives -1 ) + " lives.");
                System.out.println("Guess again: ");
                userGuess = guessScanner.nextInt();
                lives--;
              break;

            } else if (lives == 1) {
                System.out.println("R.I.P");
                break;

            } else  {
                System.out.println("Congratulations. You won! Random number was " + randomNumberToGuess);
                break;
            }
            if (lives == 0) { System.out.println("R.I.P");}
        }
    }
}
