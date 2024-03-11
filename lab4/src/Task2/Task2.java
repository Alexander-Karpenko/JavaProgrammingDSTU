package Task2;

public class Task2 {
    public static void main(String[] args) {
        Complex complex1 = new Complex(4, 1);
        Complex complex2 = new Complex(2, 1);
//        Complex complex3 = complex1.add(complex2);
//        System.out.println(complex3.getReal());
//        System.out.println(complex3.getImaginary());
//        Complex complex4 = complex1.subtract(complex2);
//        System.out.println(complex4.getReal());
//        System.out.println(complex4.getImaginary());
        Complex complex4 = complex1.multiply(complex2);
        System.out.println(complex4.getReal());
        System.out.println(complex4.getImaginary());

    }
}
