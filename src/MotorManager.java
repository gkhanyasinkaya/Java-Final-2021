import java.util.ArrayList;

public class MotorManager {
    ArrayList<ArrayList> AllParts = new ArrayList<ArrayList>();

    public MotorManager(){}
    public void PriceOfaMotor(Motorbike motorbike){
        ArrayList<String> mParts = new ArrayList<String>();
        if(motorbike.getABS()){
            motorbike.Price += 5000;
            mParts.add("ABS");
        }
        if(motorbike.getSeatHeat()){
            motorbike.Price += 2000;
            mParts.add("Seat Heating");
        }
        AllParts.add(mParts);
    }

    public ArrayList<ArrayList> getAllParts() {
        return AllParts;
    }


}
