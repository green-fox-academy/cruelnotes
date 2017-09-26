import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TreeOfLife2 {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, HEIGHT, WIDTH);
        graphics.setColor(Color.WHITE);
        int firstAx = WIDTH / 2 ;
        int firstAy = HEIGHT-500 - (HEIGHT / 2);
        int firstBx = WIDTH / 2;
        int firstBy = HEIGHT-500 - HEIGHT/8;
        graphics.drawLine(firstAx, firstAy, firstBx, firstBy);
        int angle = -90;
        int size = (int) (HEIGHT/100 * 3.7);
        drawTree(graphics, firstBx, firstBy, angle, 6, size);


    }

    private static void drawTree(Graphics g, int x1, int y1, double angle, int depth, int size){
        if (depth == 0)
            return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * size * 1.1);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * size * 1.1);
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle, depth - 1, (int)(size));


        }


    //    Don't touch the code below
    static int WIDTH = 2000;
    static int HEIGHT = 2000;

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


