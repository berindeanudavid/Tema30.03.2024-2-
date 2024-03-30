public class Program
{
    public static void main(String[] args)
    {
        Avion a1,a2,a3,a4,a5,a6,a7;
        a1=new Avion();
        a2=new AvionCalatori();
        a3=new AvionCalatoriBoeing();
        a4=new AvionCalatoriConcorde();
        a5=new AvionLupta();
        a6=new AvionLuptaMig();
        a7=new AvionLuptaTomcat();
        a1.setPlaneID("45364");
        a1.setTotalEnginePower(550);
        System.out.println(a1.getPlaneID());
        System.out.println(a1.getTotalEnginePower());
        a1.takeOff();
        a1.fly();
        a1.land();
        ((AvionCalatori)a2).setMaxPassengers(150);
        System.out.println(((AvionCalatori)a2).getMaxPassengers());
        //a3 nu are prorietati speciale
        ((AvionCalatoriConcorde)a4).goSubSonic();
        ((AvionCalatoriConcorde)a4).goSuperSonic();
        ((AvionLupta)a5).launchMissile();
        ((AvionLuptaMig)a6).highSpeedGeometry();
        ((AvionLuptaMig)a6).normalGeometry();
        ((AvionLuptaTomcat)a7).refuel();
    }
}
