public class Avion
{
    private String planeID;
    public String getPlaneID()
    {
        return this.planeID;
    }
    public void setPlaneID(String ID)
    {
        this.planeID=ID;
    }
    private int totalEnginePower;
    public int getTotalEnginePower()
    {
        return this.totalEnginePower;
    }
    public void setTotalEnginePower(int totalEnginePower)
    {
        this.totalEnginePower=totalEnginePower;
    }
    public void takeOff()
    {
        System.out.println(this.planeID+" - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
    }
    public void fly()
    {
        System.out.println(this.planeID+" - Flying");
    }
    public void land()
    {
        System.out.println(this.planeID+" - Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
}