

 import java.util.Scanner;

 public class test {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number.");
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
    }

     static int sumDigits(int n) {

        {
                    if ((n/10) == 0) {
                    return 1;
                } else {
                    return 1 + sumDigits(n/10);
                }
        }
    }
 }