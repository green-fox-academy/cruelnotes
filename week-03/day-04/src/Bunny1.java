// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {
    public static void main(String[] args) {
        System.out.println(floppyEars(10, 0));
    }

    private static int floppyEars(int n, int total) {
            if (n == 0) {
                return total;
            } else {
                total = total + 2;
                return floppyEars(n - 1, total);
        }
    }
}