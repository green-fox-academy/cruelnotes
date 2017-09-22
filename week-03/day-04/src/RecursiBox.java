//    import javax.swing.*;
//import java.awt.*;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;
//
//    public class RecursiBox {
//
//        public static void mainDraw(Graphics graphics){
//            // draw the canvas' diagonals in green.
//
//            graphics.setColor(Color.GREEN);
//
//            drawBoxes(graphics, WIDTH/2, HEIGHT/2, WIDTH/3);
//        }
//
//        private static void drawBoxes(Graphics g, int centerX, int centerY, int size ) {
//
//            int size
//
//            g.drawRect(0,0,size,size); g.drawRect(size,0,size,size); g.drawRect(2 * size,0,size,size);
//            g.drawRect(0,size,size,size); g.drawRect(size,size,size,size); g.drawRect(2 * size,size,size,size);
//            g.drawRect(0,2 * size,size,size); g.drawRect(size,2 * size,size,size); g.drawRect(2 * size,2 * size,size,size);
//
//
//
//        }
//
//        //    Don't touch the code below
//        static int WIDTH = 600;
//        static int HEIGHT = 600;
//
//        public static void main(String[] args) {
//            JFrame jFrame = new JFrame("Drawing");
//            jFrame.setSize(new Dimension(WIDTH, HEIGHT));
//            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//            jFrame.add(new ImagePanel());
//            jFrame.setLocationRelativeTo(null);
//            jFrame.setVisible(true);
//        }
//        static class ImagePanel extends JPanel{
//            @Override
//            protected void paintComponent(Graphics graphics) {
//                super.paintComponent(graphics);
//                mainDraw(graphics);
//        }
//    }
//}
//
//
