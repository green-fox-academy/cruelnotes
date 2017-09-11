import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have

        int chickenLegs = 2;
        int pigLegs = 4;
        Scanner animalTypeScanner = new Scanner(System.in);

        System.out.println("Number of chickens: ");
        int chickenCount = animalTypeScanner.nextInt();
        System.out.println("Number of pigs: ");
        int pigCount = animalTypeScanner.nextInt();

        int allLegs = (pigCount * pigLegs) + (chickenCount * chickenLegs);

        System.out.println("The animals have " + allLegs +" legs in total.");
    }
}