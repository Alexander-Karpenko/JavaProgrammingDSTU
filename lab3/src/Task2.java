import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int rows = scanner.nextInt();

        System.out.println("Введите количество столбцов: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];
        array = new int[][]{{1, -1},{-2,3,4},{1,2,3,4,5}};

//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = scanner.nextInt();
//            }
//        }

        int maxNegative = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (array[i][j] < 0 && array[i][j] > maxNegative) {
                    maxNegative = array[i][j];
                }
            }
        }
        if( maxNegative == Integer.MIN_VALUE){
            System.out.println("Отрицательных элементов нет");
        }else {
            System.out.println("Наибольший отрицательный элемент: " + maxNegative);
        }
    }
}
