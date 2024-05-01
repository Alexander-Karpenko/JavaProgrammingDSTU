import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Task6 extends JFrame {
    private BufferedImage img;
    private BufferedImage originalImg;
    private boolean flipped = false;
    private boolean grayscale = false;
    private boolean blur = false;

    public Task6() {
        try {
            img = ImageIO.read(new File("C:\\Users\\0gree\\OneDrive\\Desktop\\Dark Souls II Screenshot 2024.03.24 - 11.26.15.59.png"));
            originalImg = ImageIO.read(new File("C:\\Users\\0gree\\OneDrive\\Desktop\\Dark Souls II Screenshot 2024.03.24 - 11.26.15.59.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                repaint();
            }
        });

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyChar()) {
                    case 'R':
                    case 'r':
                        flipped = !flipped;
                        break;
                    case 'G':
                    case 'g':
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
                        break;
                    case 'B':
                    case 'b':
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
                        break;
                }
            }
        });
        this.setFocusable(true);
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
        Task6 task6 = new Task6();
        task6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        task6.setSize(300, 300);
        task6.setVisible(true);
    }
}

