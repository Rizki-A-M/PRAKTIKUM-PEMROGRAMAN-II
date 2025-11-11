package tools;

public class Axe extends Tool implements Usable
{
    public Axe()
    {
        super("Axe");
    }

    @Override
    public void use()
    {
        System.out.println("Kamu menggunakan " + name + " untuk menebang pohon...");
    }
}