import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;
        double step = pi / 15;
        double x = pi / 15;
        double sinX = Math.sin(x);
        double expX = Math.exp(x) / x  *  Math.log(x);
        DecimalFormat xFormat = new DecimalFormat("0.00000");
        DecimalFormat funFormat = new DecimalFormat("0.0000000");
        System.out.printf("%10s", " x ");
        System.out.printf("%15s", "sin(x) ");
        System.out.printf("%15s", "e^x / x * lg(x)");
        System.out.println();


        while (x <= pi) {
            System.out.printf("%10s", xFormat.format(x));
            System.out.printf("%15s", funFormat.format(sinX));
            System.out.printf("%15s", funFormat.format(expX));
            System.out.println();
            x += step;
            sinX = Math.sin(x);
            expX = Math.exp(x) / x  *  Math.log(x);
        }
    }
}
