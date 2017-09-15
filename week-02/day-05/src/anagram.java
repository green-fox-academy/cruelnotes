import java.util.ArrayList;
import java.util.Scanner;

public class anagram {

    public static void main(String[] args) {

        Scanner anagramScanner = new Scanner(System.in);

        System.out.println("This program will decide of 2 given words if it's an Anagram");

        System.out.println("Please provide the first word:");
        String wordA = anagramScanner.nextLine();

        System.out.println("Please provide the second word:");
        String wordB = anagramScanner.nextLine();


        if (wordA.length() > 0 && wordA.length() == wordB.length()) {
              if (anagramCheck(wordA, wordB)) {
                System.out.println(wordA + " is an anagram of " + wordB + " are anagrams.");
            } else {
                System.out.println(wordA + " is not an anagram of " + wordB + ".");
              }

        } else {
            System.out.println("The words aren't the same length, it can't be an Anagram");
        }
    }

    private static boolean anagramCheck(String firstWord, String secondWord) {

        boolean returnValue;

        String[] firstArray = firstWord.split("");
        String[] secondArray = secondWord.split("");

        ArrayList<String> firstArrayList = new ArrayList<String>();
        ArrayList<String> secondArrayList = new ArrayList<String>();

        for (int i = 0, j = 0; i < firstArray.length ; i++, j++) {
            firstArrayList.add(firstArray[i]);
            secondArrayList.add(secondArray[j]);
        }

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++ ) {
                if (firstArray[i].equals(secondArray[j])  ) {
                    firstArrayList.remove(firstArray[i]);
                    secondArrayList.remove(secondArray[j]);
                }
            }
        }

        if (firstArrayList.size() + secondArrayList.size() == 0) {
            returnValue = true;
        } else {
            returnValue = false;
        }
    return returnValue;
    }
}
