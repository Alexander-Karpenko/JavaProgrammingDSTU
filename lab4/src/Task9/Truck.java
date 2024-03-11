package Task9;

import Task1.Type;
import Task4.Engine;

public class Truck extends Car {
    public Truck(String brand, String color, int wheelsNum, Engine engine) {
        super(brand, Type.TRUCK, color, wheelsNum, engine);
    }
}
