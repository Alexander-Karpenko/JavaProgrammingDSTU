package Task9;

import Task1.Type;
import Task4.Engine;

public final class Bus extends Car {
    public Bus(String brand, String color, int wheelsNum, Engine engine) {
        super(brand, Type.BUS, color, wheelsNum, engine);
    }
    @Override
    public void printInfo(){
        System.out.println(Bus.class.toString() + "\n" +
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
