package Task9;

import Task1.Type;
import Task4.Engine;

import java.util.regex.Pattern;

public class FireTruck extends Car {
    public FireTruck(String brand, String color, int wheelsNum, Engine engine) {
        super(brand, Type.TRUCK, "Red", wheelsNum, engine);

    }

    @Override
    public void setRegisterSign(String registerSign) {
        if (!Pattern.matches("[А-Я] [0-9]{2}-[0-9]{2}/[0-9] ([0-9]{4})", registerSign)) {
            throw new IllegalArgumentException("Invalid registration number format");
        }
        super.setRegisterSign(registerSign);
    }
    @Override
    public void printInfo(){
        System.out.println(FireTruck.class.toString() + "\n" +
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
                "   public void printInfo()\n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
        );
    }
}
