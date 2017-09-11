import java.util.Scanner;

public class OddEven {

// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int input = inputScanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("Input number is even.");
        } else {
            System.out.println("Input number is odd.");
        }



    }


}

