package Task1;

public class CarTest {
    public static void main(String[] args)  {
        Car car = new Car("Toyota", Type.PASSENGER, "Red", 120, 4);
        car.setRegisterSign("А 232 ХВ 00 RUS");
        car.setColor("Blue");
        System.out.println(car);
    }
}
