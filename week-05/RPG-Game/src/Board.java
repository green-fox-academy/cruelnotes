import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Set;

public class Board extends JComponent implements KeyListener {

    int heroPosX;
    int heroPosY;
    String heroImg;
    int[][] boardGame = new int[][]{
            { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
            { 0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
            { 0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            { 1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
            { 0, 1, 0, 1, 0, 0, 0, 0, 1, 0},
            { 0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
            { 0, 0, 0, 0, 0, 1, 1, 0, 1, 0},
            { 0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
            { 0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
    };


    public Board() {
        heroPosX = 1;
        heroPosY = 1;
        heroImg = "./assets/hero-down.png";
        setPreferredSize(new Dimension(864, 1064));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        System.out.println();
        String floor = "./assets/floor.png";
        SetTable levelOne = new SetTable(floor,1,1, boardGame);
        levelOne.printBoardArray(graphics);
        Hero karcsi = new Hero(heroImg, heroPosX, heroPosY);
        karcsi.draw(graphics);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(board);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_UP) {
//            if (boardGame[heroPosY - 1][heroPosX] == 0) {
//                heroPosY -= 1;
//            }
//        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
//            heroImg = "./assets/hero-down.png";
//            if (boardGame[heroPosY + 1][heroPosX] == 0) {
//                heroPosY += 1;
//            }
//        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
//            heroImg = "./assets/hero-left.png";
//            if (boardGame[heroPosY][heroPosX - 1] == 0) {
//                heroPosX -= 1;
//            }
//        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            heroImg = "./assets/hero-right.png";
//            if (boardGame[heroPosY][heroPosX + 1] == 0) {
//                heroPosX += 1;
//            }
//        }
        repaint();
    }
}