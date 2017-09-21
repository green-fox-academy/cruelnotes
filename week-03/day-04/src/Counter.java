    // Write a recursive function that takes one parameter: n and counts down from n

public class Counter {

    public static void main(String[] args) {


        System.out.println(counterMethod(15));

    }

        public static int counterMethod(int n) {
            for (int i = n - 1; i  > 0; i--) {
                System.out.println(n);
                n -= 1;
            }
            return n;
        }


}