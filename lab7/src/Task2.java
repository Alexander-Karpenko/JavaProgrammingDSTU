import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Task2 extends JFrame {
    private BufferedImage img;
    private BufferedImage originalImg;
    private boolean flipped = false;
    private boolean grayscale = false;
    private boolean blur = false;

    public Task2() {
        try {
            img = ImageIO.read(new File("C:\\Users\\0gree\\OneDrive\\Pictures\\Screenshots\\Снимок экрана 2024-01-18 201918.png"));
            originalImg = ImageIO.read(new File("C:\\Users\\0gree\\OneDrive\\Pictures\\Screenshots\\Снимок экрана 2024-01-18 201918.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        JButton flipButton = new JButton("Flip");
        flipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flipped = !flipped;
                repaint();
            }
        });

        JButton grayscaleButton = new JButton("Grayscale");
        grayscaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {
                        int p = img.getRGB(x,y);
                        int a = (p>>24)&0xff;
                        int r = (p>>16)&0xff;
                        int g = (p>>8)&0xff;
                        int b = p&0xff;
                        int avg = (r+g+b)/3;
                        p = (a<<24) | (avg<<16) | (avg<<8) | avg;
                        img.setRGB(x, y, p);
                    }
                }
                repaint();
            }
        });

        JButton blurButton = new JButton("Blur");
        blurButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blur = !blur;
                if (blur) {
                    float[] matrix = {
                            0.111f, 0.111f, 0.111f,
                            0.111f, 0.111f, 0.111f,
                            0.111f, 0.111f, 0.111f,
                    };
                    BufferedImageOp op = new ConvolveOp(new Kernel(3, 3, matrix));
                    img = op.filter(img, null);
                }
                repaint();
            }
        });

        JPanel panel = new JPanel();
        panel.add(flipButton);
        panel.add(grayscaleButton);
        panel.add(blurButton);
        this.add(panel, BorderLayout.SOUTH);
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
        Task2 task2 = new Task2();
        task2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        task2.setSize(300, 300);
        task2.setVisible(true);
    }
}

