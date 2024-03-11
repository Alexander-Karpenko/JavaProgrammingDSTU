import java.util.Scanner;

public class Task5 {

    public enum Relation {
        КАСАЮТСЯ,
        НЕ_ПЕРЕСЕКАЮТСЯ,
        ПЕРЕСЕКАЮТСЯ_В_ДВУХ_ТОЧКАХ,
        ПЕРВАЯ_ВЛОЖЕНА_ВО_ВТОРУЮ,
        ВТОРАЯ_ВЛОЖЕНА_В_ПЕРВУЮ,
        СОВПАДАЮТ,
    }

    public static Relation relation(int x1, int y1, double r1, int x2, int y2, double r2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        if (distance == 0 && r1 == r2){
            return Relation.СОВПАДАЮТ;
        } else if(distance == r1 + r2){
            return Relation.КАСАЮТСЯ;
        } else if(distance > Math.abs(r1 - r2)){
            return Relation.ПЕРЕСЕКАЮТСЯ_В_ДВУХ_ТОЧКАХ;
        } else if(distance < r1 - r2){
            return Relation.ВТОРАЯ_ВЛОЖЕНА_В_ПЕРВУЮ;
        } else if (distance < r2 - r1) {
            return Relation.ПЕРВАЯ_ВЛОЖЕНА_ВО_ВТОРУЮ;
        } else {
            return Relation.НЕ_ПЕРЕСЕКАЮТСЯ;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты центра первой окружности: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Введите радиус первой окружности: ");
        double r1 = scanner.nextDouble();

        System.out.println("Введите координаты центра второй окружности: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Введите радиус второй окружности: ");
        double r2 = scanner.nextDouble();

        System.out.println("Отношение окружностей: " + relation(x1, y1, r1, x2, y2, r2));
    }
}