import java.util.Scanner;



    public class MileToKmConverter {
        public static void main(String[] args) {
            // Write a program that asks for an integer that is a distance in kilometers,
            // then it converts that value to miles and prints it
            Scanner kmScanner = new Scanner(System.in);

            System.out.println("Input kms to convert to miles: ");
            int km = kmScanner.nextInt();
            double kmToMiles = (double) km * 0.621371192;

            System.out.println(kmToMiles);
        }
    }

