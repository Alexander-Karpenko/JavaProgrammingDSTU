import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите десятичное число:");
        int number = scanner.nextInt();
        System.out.println("Введите основание системы счисления:");
        int base = scanner.nextInt();
        if(base == 2) {
            System.out.println("Введенное число в двоичной системе: " + Integer.toBinaryString(number));
        }
        if(base == 8) {
            System.out.println("Введенное число в восьмеричной системе: " + Integer.toOctalString(number));
        }
//        String convertedNumber = Integer.toString(number, base);
//        System.out.println("Преобразованное число: " + convertedNumber);
    }
}
