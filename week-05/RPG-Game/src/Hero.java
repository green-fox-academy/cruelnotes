import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    String left = "./assets/hero-left.png";


    public Hero(){

        this("./assets/hero-down.png",0,0);

    }

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }

    public void setFilename(String filename) {
        inputFileName = left;
    }



     private int getPosX() {
        return posX;
    }
    private int getPosY() {
        return posY;
    }


    public void moveRight() {
    }

    public void moveUp() {
    }

    public void moveDown() {
    }
}
