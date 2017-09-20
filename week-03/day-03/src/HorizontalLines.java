import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a 50 long horizontal line from that point.
      // draw 3 lines with that function.

        for (int i = 0; i < 3 ; i++) {

            Scanner drawScanner = new Scanner(System.in);
            System.out.println("X coordinate");
            int userX = drawScanner.nextInt();
            System.out.println("Y coordinate");
            int userY = drawScanner.nextInt();

            drawHorizontal(graphics, userX, userY);
        }


    }

    private static void drawHorizontal(Graphics g, int x ,int y) {

        g.drawLine(x, y, x + 50, y);

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
