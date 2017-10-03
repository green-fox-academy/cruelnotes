//
//Map<String, int> map = new HashMap<String, int>();
//        map.put("dog", count);

import java.util.ArrayList;

public class CountLetters {

    String wordToSplit;

    public  CountLetters(String wordToSplit) {
        this.wordToSplit = wordToSplit;
    }

    public void letterCount() {

        int
        String[] myArray = wordToSplit.split("");
        ArrayList<String> myArrayList = new ArrayList<String>();

        for (int i = 0; i < myArray.length; i++) {
            myArrayList.add(myArray[i]);
       }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++ ) {
                if (firstArray[i].equals(myArray[j])  ) {
                    firstArrayList.remove(firstArray[i]);
                    secondArrayList.remove(secondArray[j]);
                }
            }
        }


    }
}
