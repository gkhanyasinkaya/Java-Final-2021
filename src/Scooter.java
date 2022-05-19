public class Scooter extends Motorbike{
    public Scooter(){
        setPrice(Price+20000);
    }
    public Scooter(Boolean ABS, Boolean SeatHeat){
        super(ABS,SeatHeat);
        setPrice(Price+20000);
    }


}