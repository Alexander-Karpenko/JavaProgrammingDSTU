import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task1 extends JFrame {
    private JComboBox<String> lafBox;
    private JLabel label;
    private JButton button;
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    private JTable table;

    public Task1() {
        setTitle("My Java Application");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lafBox = new JComboBox<>();
        label = new JLabel("Label");
        button = new JButton("Button");
        checkBox = new JCheckBox("Check Box");
        radioButton = new JRadioButton("Radio Button");

        String[] columnNames = {"Язык", "Автор", "Год"};
        Object[][] data = {
                {"Си", "Деннис Ритчи", 1972},
                {"C++", "Бьерн Страуструп", 1983},
                {"Python", "Гвидо ван Россум", 1991},
                {"Java", "Джеймс Гослинг", 1995},
                {"JavaScript", "Брендон Айк", 1995},
                {"C#", "Андерс Хейлсберг", 2001},
                {"Scala", "Мартин Одерски", 2003}
        };
        table = new JTable(data, columnNames);

        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            lafBox.addItem(info.getName());
        }

        lafBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String lafName = (String) lafBox.getSelectedItem();
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if (lafName.equals(info.getName())) {
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                            SwingUtilities.updateComponentTreeUI(Task1.this);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        break;
                    }
                }
            }
        });

        setLayout(new FlowLayout());
        add(lafBox);
        add(label);
        add(button);
        add(checkBox);
        add(radioButton);
        add(new JScrollPane(table));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Task1();
            }
        });
    }
}

