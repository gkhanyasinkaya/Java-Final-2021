public class Test {
    public static void main(String args[]){
        int TotalPrice = 0;

        Inventory inv = new Inventory();
        CarManager cMan = new CarManager();
        MotorManager mMan = new MotorManager();


        Car car1 = new Sivic(true,true,true,false);
        cMan.PriceOfaCar(car1);
        inv.AddtoInv(car1);

        Car car2 = new Sivic(false,false,true,true);
        cMan.PriceOfaCar(car2);
        inv.AddtoInv(car2);

        Car car3 = new Sity(false,true,false,true);
        cMan.PriceOfaCar(car3);
        inv.AddtoInv(car3);

        Motorbike motorbike1 = new Racer(true,true);
        mMan.PriceOfaMotor(motorbike1);
        inv.AddtoInv(motorbike1);

        Motorbike motorbike2 = new Scooter(false,true);
        mMan.PriceOfaMotor(motorbike2);
        inv.AddtoInv(motorbike2);



        int CarCount = 0;
        int MotoCount = 0;
        for (Vehicle i : inv.getVehicleList()){
            TotalPrice += i.getPrice();
            if(i.getClass() == Sivic.class){
                System.out.println("Sivic with "+cMan.AllParts.get(CarCount)+
                        " having a total price of "+i.getPrice()+" TL.");
                CarCount++;
            }
            if(i.getClass() == Sity.class){
                System.out.println("Sity with "+cMan.AllParts.get(CarCount)+
                        " having a total price of "+i.getPrice()+" TL.");
                CarCount++;
            }
            if(i.getClass() == Racer.class){
                System.out.println("Racer with "+mMan.AllParts.get(MotoCount)+
                        " having a total price of "+i.getPrice()+" TL.");
                MotoCount++;
            }
            if(i.getClass() == Scooter.class){
                System.out.println("Scooter with "+mMan.AllParts.get(MotoCount)+
                        " having a total price of "+i.getPrice()+" TL.");
                MotoCount++;
            }
        }
        System.out.println("TOTAL : "+inv.getVehicleList().size()+" Vehicles including "+inv.getCarList().size()+
                " Cars and "+inv.getMotorList().size()+" Motorbikes having a total price of "+TotalPrice+" TL.");






    }
}
