import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String string = scanner.nextLine();
        System.out.println("Введите подстроку:");
        String substring = scanner.nextLine();

        int count = 0;
        int index = string.indexOf(substring);
//        System.out.println(index);

        while (index != -1) {
            count++;
            index = string.indexOf(substring, index + 1);
        }

        System.out.println("Подстрока встречается " + count + " раз(а) в строке.");
    }
}
