// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        System.out.println(callPowerOf(3, 2, 1));
    }

    private static int callPowerOf(int base, int power, int total) {
        if (power == 0) {
            return total;
        } else {
            total = base * total;
            power -= 1;
            return callPowerOf(base, power, total);
        }
    }
}