import java.util.ArrayList;

public class Inventory {
    private ArrayList<Vehicle> VehicleList = new ArrayList<Vehicle>();
    private ArrayList<Car> CarList = new ArrayList<Car>();
    private ArrayList<Motorbike> MotorList = new ArrayList<Motorbike>();

    public Inventory(){}

    public void AddtoInv(Motorbike motorbike){
        this.VehicleList.add(motorbike);
        this.MotorList.add(motorbike);
    }

    public void AddtoInv(Car car){
        this.VehicleList.add(car);
        this.CarList.add(car);
    }


    public ArrayList<Vehicle> getVehicleList() {
        return VehicleList;
    }
    public ArrayList<Car> getCarList() {
        return CarList;
    }
    public ArrayList<Motorbike> getMotorList() {
        return MotorList;
    }



}
