public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 1, -3, -3};
        double res = 1;
        int count = 0;

        for (int j : array) {
            if (j < 0) {
                res *= j;
                count++;
            }
        }
        System.out.println("Среднее геометрическое отрицательных элементов: " +
                Math.pow(res, (double) 1 / count));
    }
}
