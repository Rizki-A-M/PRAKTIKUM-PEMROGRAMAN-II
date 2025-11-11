package core;

public class Player
{
    private final String name;
    private final String gender;
    private final String hobby;
    private int energy;

    public Player(String name, String gender, String hobby)
    {
        this.name = name;
        this.gender = gender;
        this.hobby = hobby;
        this.energy = 100;
    }

    public void reduceEnergy(int amount)
    {
        energy -= amount;
        if (energy < 0)
        {
            energy = 0;
        }
    }

    public void showStatus()
    {
        System.out.println("\n=== STATUS PEMAIN ===");
        System.out.println("Nama   : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Hobi   : " + hobby);
        System.out.println("Energi : " + energy);
    }
}