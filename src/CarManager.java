import java.util.ArrayList;

public class CarManager {
    ArrayList<ArrayList> AllParts = new ArrayList<ArrayList>();
    public CarManager(){}
    public void PriceOfaCar(Car car){
        ArrayList<String> cParts = new ArrayList<String>();
        if(car.getABS()) {
            car.Price += 5000;
            cParts.add("ABS");
        }
        if(car.getSunroof()){
            car.Price += 2000;
            cParts.add("Sunroof");
        }

        if(car.getMusicSystem()){
            car.Price += 1000;
            cParts.add("Music System");
        }
        if(car.getAirbag()){
            car.Price += 3000;
            cParts.add("Airbag");
        }
        AllParts.add(cParts);
    }

    public ArrayList<ArrayList> getAllParts() {
        return AllParts;
    }



}
