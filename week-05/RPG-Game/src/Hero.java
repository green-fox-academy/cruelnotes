import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    int posX, posY;
    BufferedImage left = ImageIO.read(new File("./assets/hero-left.png"));
    BufferedImage right = ImageIO.read(new File("./assets/hero-right.png"));
    BufferedImage up = ImageIO.read(new File("./assets/hero-up.png"));
    BufferedImage down = ImageIO.read(new File("./assets/hero-down.png"));

    public Hero(String filename, int posX, int posY) throws IOException {
        super(filename, posX, posY);
    }

    public void draw(Graphics graphics) {
        graphics.drawImage(image, posX * 72, posY * 72, null);
    }

    private int getPosX() {
        return posX;
    }
    private int getPosY() {
        return posY;
    }
    public void moveLeft() {
        image = left;
    }

    public void moveRight() {
        image = right;
    }

    public void moveUp() {
        image = up;
    }

    public void moveDown() {
        image = down;
    }
}
