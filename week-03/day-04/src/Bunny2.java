// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny2 {
    public static void main(String[] args) {
        System.out.println(floppyEars(3, 0));
    }

    private static int floppyEars(int n, int total) {
        if (n == 0) {
            return total;
        } else if (n % 2 != 0)  {
            total = total + 2;
            return floppyEars(n - 1, total);
        } else {
            total = total + 3;
            return floppyEars(n - 1, total);
        }
    }
}