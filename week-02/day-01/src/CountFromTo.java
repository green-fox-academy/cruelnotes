import java.util.Scanner;

public class CountFromTo {

    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide the first number: ");
        int firstNum = myScanner.nextInt();

        System.out.println("Please provide the first number: ");
        int secondNum = myScanner.nextInt();

        if ( firstNum >= secondNum) {
            System.out.println("The second number should be bigger!");
        }
        else {
            int i;
            for (i = firstNum; i < secondNum; i++)
                System.out.println(i);
        }
    }

}
