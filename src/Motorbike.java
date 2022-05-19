public abstract class Motorbike extends Vehicle{
    Boolean ABS;
    Boolean SeatHeat;

    public Motorbike(){}
    public Motorbike(Boolean ABS, Boolean SeatHeat){
        this.ABS = ABS;
        this.SeatHeat = SeatHeat;
    }
    // Getter methods
    public Boolean getABS() {
        return ABS;
    }
    public Boolean getSeatHeat() {
        return SeatHeat;
    }
    // Setter methods
    public void setABS(Boolean ABS) {
        this.ABS = ABS;
    }
    public void setSeatHeat(Boolean seatHeat) {
        SeatHeat = seatHeat;
    }
}
