import java.util.Scanner;

public class PrintBigger {

    // Write a program that asks for two numbers and prints the bigger one

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input a number: ");
        int firstNumber = input.nextInt();

        System.out.println("Please input an other number: ");
        int secondNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("The first number is the bigger");
        } else if (firstNumber < secondNumber) {
            System.out.println("The second number is the bigger");
        } else {
            System.out.println("The numbers are equal.");
        }
    }

}
