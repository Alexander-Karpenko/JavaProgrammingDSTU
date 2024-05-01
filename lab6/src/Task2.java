import javax.swing.*;
import java.awt.*;

public class Task2 extends JPanel {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;
    private double[] xData;
    private double[] yData;

    public Task2() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void setData(double[] xData, double[] yData) {
        this.xData = xData;
        this.yData = yData;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT);
        g.drawLine(0, HEIGHT / 2, WIDTH, HEIGHT / 2);

        for (int i = 0; i < xData.length; i++) {
            int x = (int) (WIDTH / 2 + xData[i] * WIDTH / (2 * Math.PI));
            int y = (int) (HEIGHT / 2 - yData[i] * HEIGHT / 2);
            g.fillOval(x, y, 2, 2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Task2 task2 = new Task2();
            frame.add(task2);
            frame.pack();
            frame.setVisible(true);

            int numPoints = 1000;
            double[] xData = new double[numPoints];
            double[] yData = new double[numPoints];
            for (int i = 0; i < numPoints; i++) {
                double x = 2 * Math.PI * i / numPoints;
                xData[i] = x;
                yData[i] = Math.sin(x);
            }
            task2.setData(xData, yData);
            frame.repaint();
        });
    }
}

