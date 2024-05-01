import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Task8 extends JFrame {
    private String[] messages = {"Сообщение 1", "Сообщение 2", "Сообщение 3"};
    private JLabel label;
    private Random random = new Random();

    public Task8() {
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel();
        label.setFont(new Font("Arial", Font.BOLD, 40));
        label.setHorizontalAlignment(JLabel.CENTER);
        changeMessage();

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                changeMessage();
            }
        });

        getContentPane().add(label);
        setVisible(true);

        while (true) {
            for (int i = getWidth(); i > -label.getWidth() ; i--) {
                System.out.println(i);
                label.setLocation(i, getHeight() / 6);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void changeMessage() {
        label.setText(messages[random.nextInt(messages.length)]);
        label.setSize(label.getPreferredSize());
    }

    public static void main(String[] args) {
        new Task8();
    }
}
