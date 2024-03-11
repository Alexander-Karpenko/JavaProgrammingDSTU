import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\+7|8)[-()\\s]?(\\d{3}[-()\\s]?){2}(\\d{2}[-\\s]?){2}");
        Matcher matcher = pattern.matcher(str);
        Pattern pattern2 = Pattern.compile("([23])([-()\\s]?\\d{2}){3}");
        Matcher matcher2 = pattern2.matcher(str);
        while(matcher.find()) {
            int begin = matcher.start();
            int end = matcher.end();
            System.out.println(str.substring(begin, end));
            str = str.replace(str.substring(begin, end), "");
//            System.out.println(str);
        }
        while(matcher2.find()) {
            int begin = matcher2.start();
            int end = matcher2.end();
            System.out.println(str.substring(begin, end));
        }
//        Мои номера 220-30-40 и 8904-378-16-61 не считая служебных

    }
}
