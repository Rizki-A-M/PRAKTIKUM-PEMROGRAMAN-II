package tools;

public class WateringCan extends Tool implements Usable
{
    public WateringCan()
    {
        super("Watering Can");
    }

    @Override
    public void use()
    {
        System.out.println("Kamu menggunakan " + name + " untuk menyiram tanaman...");
    }
}