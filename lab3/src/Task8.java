import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите степень полинома:");
        int n = scanner.nextInt();

        System.out.println("Введите коэффициенты полинома:");
        double[] coefficients = new double[n + 1];
        for (int i = 0; i < coefficients.length; i++) {
            coefficients[i] = scanner.nextDouble();
        }

        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result = result  *  n + coefficients[i];
            n--;
        }

        System.out.println("Значение полинома: " + result);
    }

}
