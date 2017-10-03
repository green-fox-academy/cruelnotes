import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    String heroImgPos;

    public Board() {
        testBoxX = 0;
        testBoxY = 0;
        heroImgPos = "./assets/hero-down.png";

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

//    @Override
//    public void paintFloor(Graphics graphics) {
//        super.paint(graphics);
//        // graphics.fillRect(testBoxX, testBoxY, 72, 72);
//        // here you have a 720x720 canvas
//        // you can create and draw an image using the class below e.g.
//        PositionedImage floor = new PositionedImage("./assets/floor.png", 0, 0);
//        floor.draw(graphics);
//    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
       // graphics.fillRect(testBoxX, testBoxY, 72, 72);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        ;

        for (int floorPosX = 0; floorPosX < 721 ; floorPosX +=72) {
            for (int floorPosY = 0; floorPosY < 721 ; floorPosY+=72) {
                PositionedImage floor = new PositionedImage("./assets/floor.png", floorPosX, floorPosY);
                floor.draw(graphics);
            }
        }

        PositionedImage image = new PositionedImage(heroImgPos, testBoxX, testBoxY);
        image.draw(graphics);
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            heroImgPos = "./assets/hero-up.png";
            testBoxY -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            heroImgPos = "./assets/hero-down.png";
            testBoxY += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            heroImgPos = "./assets/hero-left.png";
            testBoxX -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            heroImgPos = "./assets/hero-right.png";
            testBoxX += 72;
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}