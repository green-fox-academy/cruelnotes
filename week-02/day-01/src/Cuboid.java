import java.util.Scanner;

public class Cuboid {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000
    public static void main(String[] args) {
        Scanner cuboidScanner = new Scanner(System.in);
        System.out.println("Cuboid side a:");
        int a = cuboidScanner.nextInt();
        System.out.println("Cuboid side b:");
        int b = cuboidScanner.nextInt();
        System.out.println("Cuboid side c:");
        int c = cuboidScanner.nextInt();
        int surface = 2 * (a * b + b * c + a * c);
        int volume = a * b * c;

        System.out.println("Surface Area: " + surface + "m2");
        System.out.println("Volume: " + volume + "m3");
    }
}
