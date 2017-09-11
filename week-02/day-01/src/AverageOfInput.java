import java.util.Scanner;

public class AverageOfInput {

    // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
    public static void main(String[] args) {
        Scanner intScanner = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("Please define 5 integers!");
        System.out.println("First: ");
        a = intScanner.nextInt();
        System.out.println("Second: ");
        b = intScanner.nextInt();
        System.out.println("Third: ");
        c = intScanner.nextInt();
        System.out.println("Fourth: ");
        d = intScanner.nextInt();
        System.out.println("Fifth: ");
        e = intScanner.nextInt();

        int sum = a + b + c + d + e;
        double avg = (double) sum / 5.0;

        System.out.print("Sum: " + sum);
        System.out.print(" Average: " + avg);
    }
}
