// Given a non-negative int n, return the sum of its digits recursively (no loops). 
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigit {

    public static void main(String[] args) {

        System.out.println(sumDigit(129, 0));

    }

    private static int sumDigit(int n, int total) {
        if (n == 0) {
            return total;
        } else {
            total = total + n % 10;
            n = n / 10;
            return sumDigit(n, total);
        }
    }
}