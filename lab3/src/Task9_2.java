import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку");
            String str = scanner.nextLine();
            Pattern pattern = Pattern.compile("([23])([-()\\s]?\\d{2}){3}");
            Matcher matcher = pattern.matcher(str);
            if(matcher.find()){
                System.out.println("введен номер");
            }else {
                System.out.println("введен не номер");
            }
        }
    }
}
