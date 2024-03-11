public class Task1 {
    public static void main(String[] args) {
        System.out.println("Таблица минимальных и максимальных значений для простых числовых типов:");
        System.out.println("Тип данных\tМинимальное значение\tМаксимальное значение");
        System.out.println("byte\t\t" + Byte.MIN_VALUE + "\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t\t" + Short.MIN_VALUE + "\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        System.out.println("long\t\t" + Long.MIN_VALUE + "\t\t" + Long.MAX_VALUE);
        System.out.println("float\t\t" + Float.MIN_VALUE + "\t\t" + Float.MAX_VALUE);
        System.out.println("double\t\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
    }
}