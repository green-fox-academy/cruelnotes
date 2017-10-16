import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Character extends PositionedImage {

    public Character(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void move(String where, int posX, int posY) {
        try {
            image = ImageIO.read(new File(where));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
