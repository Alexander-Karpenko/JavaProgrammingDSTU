package Task9;

public class Engine {
    private String serialNumber;
    private int power;
    private double volume;
    private String fuelCons;
    private String fuelType;
    private int numberOfCylinders;

    public Engine(){}

    public Engine(String serialNumber, int power, double volume, String fuelCons, String fuelType, int numberOfCylinders) {
        this.serialNumber = serialNumber;
        this.power = power;
        this.volume = volume;
        this.fuelCons = fuelCons;
        this.fuelType = fuelType;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(String fuelCons) {
        this.fuelCons = fuelCons;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "serialNumber='" + serialNumber + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", fuelCons='" + fuelCons + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
