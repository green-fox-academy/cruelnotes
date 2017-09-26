import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class TreeOfLife {

        public static void mainDraw(Graphics graphics){
            // draw the canvas' diagonals in green.
            graphics.setColor(new Color(0, 49, 63));
            graphics.fillRect(0,0,WIDTH,HEIGHT);
            graphics.setColor(new Color(255, 216,0 ));
            int firstAx = WIDTH / 2 ;
            int firstAy = HEIGHT - (HEIGHT / 10);
            int firstBx = WIDTH / 2;
            int firstBy = HEIGHT - HEIGHT/4;
            graphics.drawLine(firstAx, firstAy, firstBx, firstBy);
            int radius = 360-50;
            int size = HEIGHT/10;
            drawTree(graphics, firstBx, firstBy, radius, size, 4, 0);


        }

        private static void drawTree(Graphics g, int startX, int startY, int radius, int size, int level, int degree) {

            if (level == 0) {
                return;
            } else {

                int x2_r = startX + (int) (Math.cos(Math.toRadians(radius + degree)) * size * 2);
                int y2_r = startY + (int) (Math.sin(Math.toRadians(radius + degree)) * size * 2);

                int x2_l = startX - (int) (Math.cos(Math.toRadians(-radius + degree)) * size * 2);
                int y2_l = startY - (int) (Math.sin(Math.toRadians(-radius + degree)) * size * 2);

                int x2_m = startX - (int) (Math.sin(Math.toRadians(radius - radius + degree)) * size * 2.5);
                int y2_m = startY - (int) (Math.sin(Math.toRadians(-radius - radius + degree)) * size * 2.5);

                g.setColor(Color.BLUE);
                g.drawLine(startX, startY, x2_r, y2_r);
                g.setColor(Color.WHITE);
                g.drawLine(startX, startY, x2_l, y2_l);
                g.setColor(Color.RED);
                g.drawLine(startX, startY, x2_m, y2_m);

 //               +=(int) Math.toRadians(Math.PI/6)


                drawTree(g, x2_l, y2_l , radius+40, (int)size - size / 10, level -1, degree);
                drawTree(g, x2_m, y2_m , radius, (int)size - size / 10, level -1, degree);
                drawTree(g, x2_r, y2_r , radius+40, (int)size - size / 10, level -1, degree);

            }
        }

        //    Don't touch the code below
        static int WIDTH = 1000;
        static int HEIGHT = 1000;

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


