import java.util.ArrayList;
import java.util.Scanner;

public class palindromeSearcher {


    public static void main(String[] args) {

    Scanner anagramScanner = new Scanner(System.in);

    System.out.println("This program will search within the given words if there is a palindrome to return");

    System.out.println("Please provide a line to search for palindromes:");
    String inputStringLine = anagramScanner.nextLine();

    System.out.println(searchPalindrome(inputStringLine));
    }

    private static String earchPalindrome(String inputStringLine) {
        ArrayList<String> palidromeArrayList = new ArrayList<String>();

        for (int i = 0; i < inputStringLine.length() - 3; i++) {
            for (int j = i + 3; j < inputStringLine.length(); j++) {
                String wordSubstring = inputStringLine.substring(i,j);
                String substringReverse = new StringBuffer(wordSubstring).reverse().toString();
                if (wordSubstring.equals(substringReverse)) {
                    palidromeArrayList.add(wordSubstring);
                }
            }
        }
        String palindrome = String.join(", ", palidromeArrayList);
        return palindrome;
    }
}
