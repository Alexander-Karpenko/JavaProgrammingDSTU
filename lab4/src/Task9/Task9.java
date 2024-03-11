package Task9;

import Task1.Type;
import Task4.Engine;

public class Task9 {
    public static void main(String[] args) {
        Car car = new Bus("1", "1",4, new Engine("1",123, 3," "," ",6));
        car.printInfo();
    }
}
