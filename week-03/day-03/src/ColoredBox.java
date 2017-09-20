import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics){
      // draw a box that has different colored lines on each edge.

        int a1 =10 ;
        int a2 =10 ;
        int b1 =110 ;
        int b2 =10 ;
        int c1 =110 ;
        int c2 =110 ;
        int d1 =10 ;
        int d2 =110 ;

        graphics.setColor(Color.RED);
        graphics.drawLine(a1, a2, b1, b2);
        graphics.setColor(Color.ORANGE);
        graphics.drawLine(b1, b2, c1, c2);
        graphics.setColor(Color.CYAN);
        graphics.drawLine(c1, c2, d1, d2);
        graphics.setColor(Color.WHITE);
        graphics.drawLine(d1, d2, a1, a2);

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
