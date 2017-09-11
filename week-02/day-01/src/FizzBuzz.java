public class FizzBuzz {
    // Write a program that prints the numbers from 1 to 100.
// But for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.

    public static void main(String[] args) {

        int count = 1;
        while (count < 101) {

            if (count % 3 == 0 && count % 5 != 0) {
                System.out.println("Fizz");
                count++;
            } else if (count % 5 == 0 && count % 3 != 0) {
                System.out.println("Buzz");
                count++;
            } else if (count % 5 == 0 && count % 3 == 0) {
                System.out.println("FizzBuzz");
                count++;
            } else {
                System.out.println(count);
                count++;
            }
        }
    }
}







