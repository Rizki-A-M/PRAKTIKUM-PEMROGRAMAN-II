package tools;

public class Pickaxe extends Tool implements Usable
{
    public Pickaxe()
    {
        super("Pickaxe");
    }

    @Override
    public void use()
    {
        System.out.println("Kamu menggunakan " + name + " untuk memecah batu...");
    }
}