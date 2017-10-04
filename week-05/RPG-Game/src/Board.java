import javafx.scene.control.Cell;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int testBoxX;
    int testBoxY;
    String heroImg;
 //   private int[][] boardGame;

    public Board() {
        testBoxX = 1;
        testBoxY = 1;
        heroImg = "./assets/hero-down.png";

        // set the size of your draw board
        setPreferredSize(new Dimension(864, 1064));
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

        int row,col;
        int[][] boardGame = new int[][]{
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


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);


        System.out.println();

        //------------------------Printing boardArray-----------------//

        for(row = 0; row < boardGame.length; row++){
            System.out.println();
            for(col = 0; col < boardGame[row].length; col++) {
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



        Hero karcsi = new Hero(heroImg, 1, 1);
        karcsi.draw(graphics);
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
            heroImg = "./assets/hero-up.png";
            if (boardGame[testBoxY - 1][testBoxX] == 0) {
                testBoxY -= 1;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            heroImg = "./assets/hero-down.png";
            if (boardGame[testBoxY + 1][testBoxX] == 0) {
                testBoxY += 1;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            heroImg = "./assets/hero-left.png";
            if (boardGame[testBoxY][testBoxX - 1] == 0) {
                testBoxX -= 1;
            }
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            heroImg = "./assets/hero-right.png";
            if (boardGame[testBoxY][testBoxX + 1] == 0) {
                testBoxX += 1;
            }
        }
        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}