import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Task7 extends JPanel {
    private List<Ball> balls = new ArrayList<>();

    public Task7() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);
        Timer timer = new Timer(1, e -> repaint());
        timer.start();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Ball ball = new Ball(e.getX(), e.getY());
                balls.add(ball);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (Ball ball : balls) {
            ball.move();
            g2d.setColor(ball.color);
            g2d.fillOval(ball.x, ball.y, ball.size, ball.size);
        }
    }

    private class Ball {
        int x, y, size = 50, speed = (int) (Math.random() * 20 + 10);
        double dx = speed * Math.cos(Math.toRadians(45)), dy = speed * Math.sin(Math.toRadians(45));
        Color color = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());

        Ball(int x, int y) {
            this.x = x - size / 2;
            this.y = y - size / 2;
        }

        void move() {
            if (x + dx < 0 || x + size + dx > getWidth()) dx = -dx;
            if (y + dy < 0 || y + size + dy > getHeight()) dy = -dy;
            x += dx;
            y += dy;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new Task7());
            frame.pack();
            frame.setVisible(true);
        });
    }
}

