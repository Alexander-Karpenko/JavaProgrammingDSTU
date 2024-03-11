package Task9;

import Task1.Type;
import Task4.Engine;

import java.util.regex.Pattern;

public abstract class Car {
    private String registerSign;
    private final String brand;
    private final Type type;
    private String color;
    private Engine engine = new Engine();
    private final int wheelsNum;
    private DepotState depotState;

    public Car(String brand, Type type, String color, int wheelsNum, Engine engine) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.wheelsNum = wheelsNum;
        this.engine = engine;
        this.depotState = DepotState.OUTSIDE_DEPOT;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getRegisterSign() {
        return registerSign;
    }

    public void setRegisterSign(String registerSign) {
        if (!Pattern.matches("[АВЕКМНОР-УХ] [0-9]{3} [АВЕКМНОР-УХ]{2} [0-9]{2,3} RUS", registerSign)) {
            throw new IllegalArgumentException("Invalid registration number format");
        }
        this.registerSign = registerSign;
    }

    public DepotState getDepotState() {
        return depotState;
    }

    public void setDepotState(DepotState depotState) {
        this.depotState = depotState;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.println(Car.class.toString() + "\n" +
                "______________________________" + "\n"  +
                "    String registerSign;\n" +
                "    final String brand;\n" +
                "    final Type type;\n" +
                "    String color;\n" +
                "    Engine engine = new Engine();\n" +
                "    final int wheelsNum;\n" +
                "    DepotState depotState;\n" +
                "______________________________" + "\n" +
                "   public void setRegisterSign(String registerSign)\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                );
    }

    @Override
    public String toString() {
        return "Car{" +
                "registerSign='" + registerSign + '\'' +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", wheelsNum=" + wheelsNum +
                '}';
    }
}
