package Task1;

import java.util.regex.Pattern;

public class Car {
    private String registerSign;
    private final String brand;
    private final Type type;
    private String color;
    private int enginePower;
    private final int wheelsNum;

    public Car(String brand, Type type, String color, int enginePower, int wheelsNum) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.enginePower = enginePower;
        this.wheelsNum = wheelsNum;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registerSign='" + registerSign + '\'' +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", enginePower=" + enginePower +
                ", wheelsNum=" + wheelsNum +
                '}';
    }
}
