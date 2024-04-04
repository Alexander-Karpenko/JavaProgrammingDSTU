import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество команд (N): ");
        int N = scanner.nextInt();

        if (N <= 1 || N % 2 != 0) {
            System.out.println("Недопустимое значение N. Устанавливается значение по умолчанию (8).");
            N = 8;
        }

        ArrayList<String> teams = generateTeamNames(N);

        ArrayList<String> drawBag = new ArrayList<>(teams);
        Collections.shuffle(drawBag);

        while (drawBag.size() > 1) {
            ArrayList<String> winners = new ArrayList<>();
            for (int i = 0; i < drawBag.size(); i += 2) {
                String team1 = drawBag.get(i);
                String team2 = drawBag.get(i + 1);

                System.out.println("Игра: " + team1 + " против " + team2);
                System.out.print("Какая команда выиграла? (1 - " + team1 + ", 2 - " + team2 + "): ");
                int winnerIndex = scanner.nextInt();

                if (winnerIndex == 1) {
                    winners.add(team1);
                } else {
                    winners.add(team2);
                }
            }
            drawBag = new ArrayList<>(winners);
        }

        // Вывод победителя турнира
        System.out.println("Победитель турнира: " + drawBag.get(0));
    }

    private static ArrayList<String> generateTeamNames(int N) {
        ArrayList<String> teams = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            teams.add("Команда" + i);
        }
        return teams;
    }
}
