import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 6, 3},
                {7, 5, 1},
                {3, 8, 2}
        };

        System.out.println("Матрица до сортировки:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }

        System.out.println("Матрица после сортировки:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
