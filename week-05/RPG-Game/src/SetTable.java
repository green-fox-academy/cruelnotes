import java.awt.*;

public class SetTable extends PositionedImage {

    int[][] boardGame;


    public SetTable(String filename, int posX, int posY, int[][] boardGame) {
        super(filename, posX, posY);
        this.boardGame = boardGame;
    }

    public void printBoardArray(Graphics graphics) {
        for(int row = 0; row < boardGame.length; row++){
            System.out.println();
            for(int col = 0; col < boardGame[row].length; col++) {
                System.out.print(boardGame[row][col]);
                if (boardGame[row][col] == 0) {
                    PositionedImage floor = new PositionedImage("./assets/floor.png", col, row);
                    floor.draw(graphics);
                } else if (boardGame[row][col] == 1) {
                    PositionedImage wall = new PositionedImage("./assets/wall.png", col, row);
                    wall.draw(graphics);
                }
            }
        }
    }
}
