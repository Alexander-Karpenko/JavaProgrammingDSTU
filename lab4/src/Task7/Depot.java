package Task7;

import java.util.ArrayList;
import java.util.List;

public class Depot {
    private int size;
    private List<Car> cars = new ArrayList<Car>();

    public Depot(int size) {
        this.size = size;
    }

    public void addCar(Car car){
        if (cars.size() < size){
            cars.add(car);
            car.setDepotState(DepotState.ON_BASE);
            System.out.println("Машина " + car.getRegisterSign() + " добавлена в депо");
        }else {
            System.err.println("Место в депо закончилось");
        }
    }
    public void deleteCar(int i){
        if (i <= cars.size()){
            if(cars.get(i) != null) {
                System.out.println("Машина " + cars.get(i).getRegisterSign() + " добавлена в депо");
                cars.remove(i);
            }else{
                System.out.println("Машины по данному индексу нет");
            }
        }else {
            System.err.println("Такого индекса нет в депо");
        }

    }
    public void sendToVoyage(Car car){
        if(car.getDepotState() != DepotState.UNDER_REPAIR){
            car.setDepotState(DepotState.IN_VOYAGE);
        }else {
            System.out.println("Машина еще в ремонте");
        }
    }
    public void sendToRepair(Car car){
        if(car.getDepotState() == DepotState.BROKEN){
            car.setDepotState(DepotState.ON_BASE);
        }else {
            System.out.println("Машины не нуждается в ремонте");
        }
    }
    public void returnFromVoyage(Car car){
        if(car.getDepotState() == DepotState.IN_VOYAGE){
            car.setDepotState(DepotState.ON_BASE);
        }else {
            System.out.println("Машина не в рейсе");
        }
    }
    public void returnFromRepair(Car car){
        if(car.getDepotState() == DepotState.UNDER_REPAIR){
            car.setDepotState(DepotState.ON_BASE);
        }else {
            System.out.println("Машина не в ремонте");
        }
    }
    public void outListInAGoodConditionCar(){
        List<Car> res = new ArrayList<>();
        for(Car car : cars){
            if(car.getDepotState() != DepotState.UNDER_REPAIR && car.getDepotState() != DepotState.BROKEN){
                res.add(car);
            }
        }
        System.out.println(res);
    }
    public void outListBrokenCar(){
        List<Car> res = new ArrayList<>();
        for(Car car : cars){
            if(car.getDepotState() == DepotState.BROKEN){
                res.add(car);
            }
        }
        System.out.println(res);
    }
    public void outListInVoyageCar(){
        List<Car> res = new ArrayList<>();
        for(Car car : cars){
            if(car.getDepotState() == DepotState.IN_VOYAGE){
                res.add(car);
            }
        }
        System.out.println(res);
    }
    public void outAllCars(){
        List<Car> res = new ArrayList<>();
        for(Car car : cars){
                res.add(car);
        }
        System.out.println(res);
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
