public class Sity extends Car{
    public Sity(){
        setPrice(Price+40000);
    }
    public Sity(Boolean Airbag, Boolean MusicSystem, Boolean ABS, Boolean Sunroof){
        super(Airbag,MusicSystem,ABS,Sunroof);
        setPrice(Price+40000);
    }

}
