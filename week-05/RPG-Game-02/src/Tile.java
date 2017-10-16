import java.awt.*;

public class Tile extends PositionedImage {

    int stepOnType;
    String filename;
    PositionedImage floor;

    public Tile(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }


    public PositionedImage getTile (Graphics graphics,int stepOnType, int indexX, int indexY) {
        if (stepOnType == 0) {
            PositionedImage floor = new PositionedImage("./assets/floor.png", indexX, indexY);
        } else if (stepOnType == 1) {
            PositionedImage floor = new PositionedImage("./assets/wall.png", indexX, indexY);
        }
    return floor;
    }
}
