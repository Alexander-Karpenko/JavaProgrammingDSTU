package Task4;

import Task4.Car;
import Task1.Type;

public class CarTest {
    public static void main(String[] args)  {
        Task4.Car car = new Car("Toyota", Type.PASSENGER, "Red", 4, new Engine("1234",
                150, 2.5, "10/100km", "petrol", 4));
        car.setRegisterSign("А 232 ХВ 00 RUS");
        car.setColor("Blue");
        System.out.println(car);
    }
}
