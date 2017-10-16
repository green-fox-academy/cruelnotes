import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Set;

public class Board extends JComponent implements KeyListener {

    int heroPosX;
    int heroPosY;
    String heroImg;
    Hero karcsi;


    public Board() {
        heroPosX = 1;
        heroPosY = 1;

        heroImg = "./assets/hero-down.png";
        setPreferredSize(new Dimension(864, 1064));
        setVisible(true);

        karcsi = new Hero();
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        System.out.println();
        String floor = "./assets/floor.png";
        SetTable levelOne = new SetTable(floor,1,1);
        levelOne.printBoardArray(graphics);
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
        if (e.getKeyCode() == KeyEvent.VK_UP) {

        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {

        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            karcsi.move("./assets/hero-left.png",0,0);
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {

        }
        repaint();
    }
}