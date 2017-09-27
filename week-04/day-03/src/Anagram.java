    //Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
    //Create a test for that.

    import java.util.ArrayList;

    public class Anagram {
    private String firstWord;
    private String secondWord;

    public Anagram(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    public boolean isAnagram() {

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
            return true;
        }
        else {
            return false;
        }
    }
}
