import java.util.Scanner;

public class PartyIndicator {
    // Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Girls attending: ");
        int girls = inputScanner.nextInt();
        System.out.println("Boys attending: : ");
        int boys = inputScanner.nextInt();


        if (girls == 0) {
            System.out.println("Sausage party");
        }

        else if ((girls + boys) < 20) {
            System.out.println("Average party");
        }

        else if (((girls + boys) > 20) && (girls < boys)) {
            System.out.println("Quite cool party");
        }
        else if (boys == girls && (boys + girls) > 20 ) {
            System.out.println("Awesom party");
        } else {
            System.out.println("Author of the excersise can't imagine a party like this.");
        }

    }
}
