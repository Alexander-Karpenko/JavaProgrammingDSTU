package Task9;

import Task1.Type;
import Task4.Engine;

public class Passenger extends Car {
    public Passenger(String brand, String color, int wheelsNum, Engine engine) {
        super(brand, Type.PASSENGER, color, wheelsNum, engine);
    }
}
