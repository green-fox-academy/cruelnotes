    // Write a recursive function that takes one parameter: n and counts down from n

public class Counter {

    public static void main(String[] args) {


        System.out.println(counterMethod(15));

    }

    private static int counterMethod(int n) {
        if (n <= 0) {
            return 0;
        } else {
            System.out.println(n);
        }
        return counterMethod(n-1);
    }
}