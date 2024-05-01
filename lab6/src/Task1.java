import javax.swing.*;
import java.awt.*;

public class Task1 extends JPanel {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;
    private static final double PI = Math.PI;

    public Task1() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT);
        g.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2);

        for (int x = -WIDTH / 2; x < WIDTH / 2; x++) {
            int y = (int) (HEIGHT / 2 - 50 * Math.sin((double) x / WIDTH * 2 * PI));
            g.fillOval(WIDTH / 2 + x, y, 2, 2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Task1());
            frame.pack();
            frame.setVisible(true);
        });
    }
}
