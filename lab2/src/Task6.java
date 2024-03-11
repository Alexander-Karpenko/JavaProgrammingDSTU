
public class Task6 {
    public static void main(String[] args) {
        int startCode = 0x0400;
        int rows = 16;
        int columns = 16;
        Task6 task6 = new Task6();
        task6.output(startCode,rows,columns);
    }
    public void output (int startCode, int rows, int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print((char) startCode + " ");
                startCode++;
            }
            System.out.println();
        }
    }
}
