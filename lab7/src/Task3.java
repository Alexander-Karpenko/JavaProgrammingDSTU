import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 extends JPanel {
    private List<Ball> balls = new ArrayList<>();
    private Timer timer;
    private int maxBalls = 10; // Максимальное количество шариков

    public Task3() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.WHITE);
        timer = new Timer(1, e -> repaint());

        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> timer.start());

        JButton stopButton = new JButton("Stop");
        stopButton.addActionListener(e -> timer.stop());

        JTextField maxBallsField = new JTextField(Integer.toString(maxBalls));
        maxBallsField.addActionListener(e -> maxBalls = Integer.parseInt(maxBallsField.getText()));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (balls.size() < maxBalls) {
                    Ball ball = new Ball(e.getX(), e.getY());
                    balls.add(ball);
                }
            }
        });

        add(startButton);
        add(stopButton);
        add(maxBallsField);
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
        g2d.setColor(Color.BLACK);
        g2d.drawString("Balls: " + balls.size() + "/" + maxBalls, 5, 15);
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
            frame.add(new Task3());
            frame.pack();
            frame.setVisible(true);
        });
    }
}
