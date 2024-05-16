import javax.swing.*;
import java.awt.*;

public class Task5 extends JPanel {
    private JLabel upperLabel;
    private JLabel downLabel;
    private JLabel centerLabel;

    public Task5() {
        setLayout(new BorderLayout());

        upperLabel = new JLabel("Upper Label");
        upperLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 10));
        upperLabel.setHorizontalAlignment(JLabel.LEFT);

        downLabel = new JLabel("Down Label");
        downLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 10));
        downLabel.setHorizontalAlignment(JLabel.RIGHT);

        centerLabel = new JLabel("Center Label");
        centerLabel.setFont(new Font("Dialog", Font.BOLD, 18));
        centerLabel.setHorizontalAlignment(JLabel.CENTER);

        add(upperLabel, BorderLayout.NORTH);
        add(downLabel, BorderLayout.SOUTH);
        add(centerLabel, BorderLayout.CENTER);

    }

    public void setPanelBackground(Color color) {
        setBackground(color);
    }

    public void setLabelForeground(Color color) {
        upperLabel.setForeground(color);
        downLabel.setForeground(color);
        centerLabel.setForeground(color);
    }


    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.setPanelBackground(Color.BLUE);
        task5.setLabelForeground(Color.WHITE);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("My Panel");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 200);
                frame.add(task5);
                frame.setVisible(true);
            }
        });
    }
}

