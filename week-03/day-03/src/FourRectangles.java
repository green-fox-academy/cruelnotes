import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
      // draw four different size and color rectangles.

        int centerX = WIDTH / 3 ;
        int centerY = HEIGHT / 3;
        int rectA2 = 20 / 2;

        graphics.setColor(Color.GREEN);
        graphics.drawRect(centerX - rectA2, centerY - rectA2, rectA2 * 2, rectA2 * 2);

        centerX = WIDTH /5 ;
        centerY = HEIGHT / 2;
        rectA2 = 40 / 2;

        graphics.setColor(Color.YELLOW);
        graphics.drawRect(centerX - rectA2, centerY - rectA2, rectA2 * 2, rectA2 * 2);

        centerX = WIDTH / 2 ;
        centerY = HEIGHT / 6;
        rectA2 = 70 / 2;

        graphics.setColor(Color.BLUE);
        graphics.drawRect(centerX - rectA2, centerY - rectA2, rectA2 * 2, rectA2 * 2);

        centerX = WIDTH / 2 ;
        centerY = HEIGHT / 2;
        rectA2 = 100 / 2;

        graphics.setColor(Color.RED);
        graphics.drawRect(centerX - rectA2, centerY - rectA2, rectA2 * 2, rectA2 * 2);

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
