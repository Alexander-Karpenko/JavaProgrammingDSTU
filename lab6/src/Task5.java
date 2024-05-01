import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Task5 extends JFrame {
    private BufferedImage img;
    private boolean flipped = false;

    public Task5() {
        try {
            img = ImageIO.read(new File("C:\\Users\\0gree\\OneDrive\\Desktop\\Dark Souls II Screenshot 2024.03.24 - 11.26.15.59.png")); // Замените на путь к вашему изображению
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                flipped = !flipped;
                repaint();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        int imageWidth = img.getWidth();
        int imageHeight = img.getHeight();
        double scale = Math.min((double)w/imageWidth, (double)h/imageHeight);
        int width = (int)(scale * imageWidth);
        int height = (int)(scale * imageHeight);
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2dImg = bi.createGraphics();
        g2dImg.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2dImg.drawImage(img, 0, 0, width, height, null);
        if (flipped) {
            g2d.rotate(Math.toRadians(180), w/2, h/2);
        }
        g2d.drawImage(bi, (w - width)/2, (h - height)/2, null);
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        task5.setSize(300, 300);
        task5.setVisible(true);
    }
}
