package tools;

public class FishingRod extends Tool implements Usable
{
    public FishingRod()
    {
        super("Fishing Rod");
    }

    @Override
    public void use()
    {
        System.out.println("Kamu menggunakan " + name + " untuk memancing ikan...");
    }
}