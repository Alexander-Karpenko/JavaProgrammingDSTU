package Task7;

import Task1.Type;
import Task4.Engine;

public final class Bus extends Car {
    public Bus(String brand, Type type, String color, int wheelsNum, Engine engine) {
        super(brand, Type.BUS, color, wheelsNum, engine);
    }
}
