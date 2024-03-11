import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку");
            String str = scanner.nextLine();
            Pattern pattern = Pattern.compile("(\\+7|8)[-()\\s]?(\\d{3}[-()\\s]?){2}(\\d{2}[-\\s]?){2}");
            Matcher matcher = pattern.matcher(str);
            if(matcher.find()){
                System.out.println("введен номер");
            }else {
                System.out.println("введен не номер");
            }
//            if (str.matches("(\\+7|8)[-()\\s]?(\\d{3}[-()\\s]?){2}(\\d{2}[-\\s]?){2}")) {
//                System.out.println("введен номер");
//            } else System.out.println("введен не номер");
//        +79043781661
//        +7(904)3781661
//        89043781661
//        8 904 378-16-61
//        +7 904 378 1661
//        +7 904 378 16 61
//        +7-904-378-16-61
        }
    }
}

