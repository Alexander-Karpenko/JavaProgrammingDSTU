import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите расстояние R:");
        double R = scanner.nextDouble();
        System.out.println("Введите расстояние r:");
        double r = scanner.nextDouble();

        System.out.println("Введите координаты предмета (x, y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (distance > R) {
            System.out.println("Не обнаружен");
        } else if (distance > r) {
            System.out.println("Обнаружен");
        } else {
            System.out.println("Тревога");
        }
    }
}
