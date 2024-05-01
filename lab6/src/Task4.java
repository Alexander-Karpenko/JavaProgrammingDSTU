import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task4 extends JFrame {
    private int x, y;
    private Color color = Color.BLACK;

    public Task4() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                switch (e.getKeyChar()) {
                    case 'b':
                        color = Color.BLACK;
                        break;
                    case 'w':
                        color = Color.WHITE;
                        break;
                    case 'r':
                        color = Color.RED;
                        break;
                    case 'g':
                        color = Color.GREEN;
                        break;
                    case 'o':
                        color = Color.ORANGE;
                        break;
                }
                repaint();
            }
        });

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        g.drawString("X: " + x + ", Y: " + y, x, y);
    }

    public static void main(String[] args) {
        new Task4();
    }
}

