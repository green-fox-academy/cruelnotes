import java.util.ArrayList;
import java.util.Scanner;

public class palindromeBuilder {

    public static void main(String[] args) {

        Scanner anagramScanner = new Scanner(System.in);

        System.out.println("This program will decide of 2 given words if they are palindrome");

        System.out.println("Please provide the a word:");
        String wordA = anagramScanner.nextLine();

        System.out.println(createPalindrome(wordA));

    }

    private static String createPalindrome(String wordToPalindrome) {

        String[] wordArray = wordToPalindrome.split("");

        ArrayList<String> palidromeArrayList = new ArrayList<String>();

        for (int i = 0; i < wordArray.length; i++) {
            palidromeArrayList.add(wordArray[i]);
            if (i == wordArray.length - 1) {
                for (int j = wordArray.length - 1; j >= 0; j--) {
                    palidromeArrayList.add(wordArray[j]);
                }
            }
        }


        String palindrome = String.join("", palidromeArrayList);

        return palindrome;
    }
}
