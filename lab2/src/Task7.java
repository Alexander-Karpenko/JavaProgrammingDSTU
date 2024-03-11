import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int totalLetters = 0;
        int totalLowerCase = 0;
        int totalUpperCase = 0;
        int totalDigits = 0;
        int totalArabicDigits = 0;
        int totalNonArabicDigits = 0;
        int totalOtherSymbols = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                totalLetters++;
                if (Character.isLowerCase(currentChar)) {
                    totalLowerCase++;
                } else {
                    totalUpperCase++;
                }
            } else if (Character.isDigit(currentChar)) {
                totalDigits++;
                if(String.valueOf(currentChar).matches("[0-9]") ){
                    totalArabicDigits++;
                } else {
                    totalNonArabicDigits++;
                }
            } else {
                totalOtherSymbols++;
            }
        }

        System.out.println("Общее количество букв: " + totalLetters);
        System.out.println("Общее количество строчных букв: " + totalLowerCase);
        System.out.println("Общее количество прописных букв: " + totalUpperCase);
        System.out.println("Общее количество цифр: " + totalDigits);
        System.out.println("Общее количество арабских цифр: " + totalArabicDigits);
        System.out.println("Общее количество не арабских цифр: " + totalNonArabicDigits);
        System.out.println("Общее количество других символов: " + totalOtherSymbols);
        System.out.println("Общее количество всех символов: " + (totalLetters + totalDigits + totalOtherSymbols));
    }
}
