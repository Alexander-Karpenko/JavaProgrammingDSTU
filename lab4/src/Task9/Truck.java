package Task9;

import Task1.Type;
import Task4.Engine;

public class Truck extends Car {
    public Truck(String brand, String color, int wheelsNum, Engine engine) {
        super(brand, Type.TRUCK, color, wheelsNum, engine);
    }
    @Override
    public void printInfo(){
        System.out.println(Truck.class.toString() + "\n" +
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
