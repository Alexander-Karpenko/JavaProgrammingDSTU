package Task7;

import Task1.Type;
import Task4.Engine;

public class Passenger extends Car {
    public Passenger(String brand, Type type, String color, int wheelsNum, Engine engine) {
        super(brand, Type.PASSENGER, color, wheelsNum, engine);
    }
}
