import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arg = args[0];
        int number = Integer.parseInt(arg);

        System.out.println("Введенное число в десятичной системе: " + number);
        System.out.println("Введенное число в двоичной системе: " + Integer.toBinaryString(number));
        System.out.println("Введенное число в восьмеричной системе: " + Integer.toOctalString(number));
        System.out.println("Введенное число в шестнадцатеричной системе: " + Integer.toHexString(number));
    }
}
