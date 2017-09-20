import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // draw 3 lines with that function.

        int centerX = WIDTH / 2 ;
        int centerY = HEIGHT / 2 ;
//        int i1 = 0;
//        int i2 = 0;

        for (int i = 0; i <3 ; i++) {

            Scanner drawScanner = new Scanner(System.in);
            System.out.println("First coordinate please: ");
            int i1 = drawScanner.nextInt();
            System.out.println("Second coordinate please: ");
            int i2 = drawScanner.nextInt();

            drawLineToCenter(graphics, i1, i2, centerX, centerY);
        }



    }

    private static void drawLineToCenter(Graphics g,int  i1, int i2, int widthM, int heightM) {

        g.drawLine(i1, i2, widthM, heightM);


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
