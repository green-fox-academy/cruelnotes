public class Game {

    public static void main(String[] args) {

        System.out.println(gameStart());
        Deck jani = new Deck();
        jani.deckGeneration();
//    for (int i = 0; i < jani.deck.length; i++) {
//      for (int j = 0; j < jani.deck[i].length; j++) {
//
//        System.out.printf(jani.deck[i][j]);
//        if (j == 1){
//          System.out.println("");
//        }
//
//      }
//    }

        System.out.println(jani.deck[1][1]);
    }

    public static String gameStart() {
        return "hello";
    }

}