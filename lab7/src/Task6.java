import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Task6 extends JComponent {
    private Color circleColor;
    private Color backgroundColor;
    private int circleCount;
    private boolean isActive;

    public Task6() {
        circleColor = Color.BLACK;
        backgroundColor = Color.WHITE;
        circleCount = 1;
        isActive = true;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isActive) {
                    circleCount = new Random().nextInt(6) + 1;
                    repaint();
                }
            }
        });
    }

    public void setCircleColor(Color color) {
        circleColor = color;
    }

    public void setBackgroundColor(Color color) {
        backgroundColor = color;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(backgroundColor);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(circleColor);
        for (int i = 0; i < circleCount; i++) {
            g.fillOval(i * getWidth() / 6, getHeight() / 2, getWidth() / 6, getWidth() / 6);
        }
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.setBackgroundColor(Color.white);
        task6.setCircleColor(Color.red  );
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Dice");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 300);
                frame.add(task6);
                frame.setVisible(true);
            }
        });
    }
}

