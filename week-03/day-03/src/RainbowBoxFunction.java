import javax.swing.*;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the square size, and the fill color,
      // and draws a square of that size and color to the center of the canvas.
      // create a loop that fills the canvas with rainbow colored squares.

        int random255 = (int)(Math.random()*256);

        Scanner drawScanner = new Scanner(System.in);
        System.out.println("Size of the box please: ");
        int boxSize = drawScanner.nextInt();
        Color inputColor = new Color(100, 100, 100);

        drawMiddleBox(graphics, boxSize, inputColor);


    }

    private static void drawMiddleBox(Graphics g, int size, Color color) {
        int random255 = (int)(Math.random()*256);
        g.setColor(color);
        g.fillRect(WIDTH / 2 - size / 2,HEIGHT / 2 - size / 2, size, size);

        for (int i = size; i < WIDTH ; i+=25) {
            g.setColor(new Color(random255, random255, random255));
            g.fillRect(WIDTH / 2 - size / 2,HEIGHT / 2 - size / 2, i, i);
        }


    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
