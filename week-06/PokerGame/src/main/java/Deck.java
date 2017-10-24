import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Deck {

    ArrayList<String> color = new ArrayList<String>(
            Arrays.asList("clubs", "diamonds", "hearts", "spades"));
    ArrayList<String> number = new ArrayList<String>(
            Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));


    String[][] deck = new String[52][2];

    public String[][] deckGeneration() {

        int y = 0;
        int x = 0;

        for (int i = 0; i < color.size(); i++) {
            for (int j = 0; j < number.size(); j++ ) {
                if (y == 1) {
                    y = 0;
                    deck[x][y] = color.get(i);
                    x += 1;
                    j--;
                } else if (y == 0) {
                    y = 1;
                    deck[x][y] = number.get(j);
                    j++;
                    x += 1;
                }
            }
        }
        return deck;
    }
}
