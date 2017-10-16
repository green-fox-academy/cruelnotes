import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        JFrame window = new JFrame("Wanderer Game");
        window.add(new Board());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
