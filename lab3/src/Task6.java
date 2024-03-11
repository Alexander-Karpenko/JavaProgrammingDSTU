import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нижнюю границу интервала:");
        double a = scanner.nextDouble();
        System.out.println("Введите верхнюю границу интервала:");
        double b = scanner.nextDouble();
        System.out.println("Введите количество точек интегрирования:");
        int n = scanner.nextInt();
        double[] xValues = new double[n];
        double[] yValues = new double[n];
        double h = (b - a) / (n - 1);
        double x = a;
        for (int i = 0; i < n; i++) {
            xValues[i] = x;
            x += h;
        }
        for (int i = 0; i < n; i++) {
            yValues[i] = Math.exp(xValues[i]) - Math.pow(xValues[i], 3);
        }
        // Вычисление интеграла аналитически
        double analyticalIntegral = (Math.exp(b) - Math.exp(a)) - (b  *  Math.exp(b) - a  *  Math.exp(a)) + (b  *  b  *  b - a  *  a  *  a) / 3;
        // Вычисление интеграла численно
        double numericalIntegral = TrapezoidalRule.integrate(xValues, yValues);
        System.out.println("Аналитическое значение интеграла: " + analyticalIntegral);
        System.out.println("Численное значение интеграла: " + numericalIntegral);
    }
}

class TrapezoidalRule {
    public static double integrate(double[] xValues, double[] yValues) {
        double sum = 0.0;
        for (int i = 0; i < xValues.length - 1; i++) {
            sum += (yValues[i] + yValues[i + 1])  *  (xValues[i + 1] - xValues[i]) / 2.0;
        }
        return sum;
    }
}

