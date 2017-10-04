import java.awt.*;

public class Hero extends PositionedImage {

    String left, right, up, down;
    int posX, posY;

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }


    public void draw(Graphics graphics) {
        graphics.drawImage(image, posX * 72, posY * 72, null);
    }

}
