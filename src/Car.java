public abstract class Car extends Vehicle{
    Boolean Airbag;
    Boolean MusicSystem;
    Boolean ABS;
    Boolean Sunroof;


    public Car(){}
    public Car(Boolean Airbag,Boolean MusicSystem,Boolean ABS,Boolean Sunroof){
        this.ABS = ABS;
        this.Airbag = Airbag;
        this.MusicSystem = MusicSystem;
        this.Sunroof = Sunroof;
    }
    // Getter methods
    public Boolean getAirbag() {
        return Airbag;
    }
    public Boolean getMusicSystem() {
        return MusicSystem;
    }
    public Boolean getABS() {
        return ABS;
    }
    public Boolean getSunroof() {
        return Sunroof;
    }

    // Setter methods
    public void setAirbag(Boolean airbag) {
        Airbag = airbag;
    }
    public void setMusicSystem(Boolean musicSystem) {
        MusicSystem = musicSystem;
    }
    public void setABS(Boolean ABS) {
        this.ABS = ABS;
    }
    public void setSunroof(Boolean sunroof) {
        Sunroof = sunroof;
    }


}
