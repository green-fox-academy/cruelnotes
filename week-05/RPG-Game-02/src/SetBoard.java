import java.awt.*;

public class SetBoard extends Tile {

    public int[][] boardGame = new int[][]{
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, -1},
            {-1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, -1},
            {-1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, -1},
            {-1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, -1},
            {-1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, -1},
            {-1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, -1},
            {-1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, -1},
            {-1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, -1},
            {-1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, -1},
            {-1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
    };

    public SetBoard() {
        super(filename, posX, posY);
    }


    public void printBoard() {
        this.boardGame = boardGame;
        int row,col;
        for(row = 0; row < boardGame.length; row++){
            System.out.println();
            for(col = 0; col < boardGame[row].length; col++) {
//                System.out.print(boardGame[row][col]);
//                if (boardGame[row][col] == 0) {
//                    PositionedImage floor = new PositionedImage("./assets/floor.png", col, row);
//                    floor.draw(graphics);
//                } else if (boardGame[row][col] == 1) {
//                    PositionedImage wall = new PositionedImage("./assets/wall.png", col, row);
//                    wall.draw(graphics);
//                }

                getTile(graphics,boardGame[row][col], row, col);
            }
        }
    }

}
