public class AvionCalatoriConcorde extends AvionCalatori
{
    public void goSuperSonic()
    {
        System.out.println(this.getPlaneID()+" - Supersonic mode activated");
    }
    public void goSubSonic()
    {
        System.out.println(this.getPlaneID()+" - Supersonic mode deactivated");
    }
}
