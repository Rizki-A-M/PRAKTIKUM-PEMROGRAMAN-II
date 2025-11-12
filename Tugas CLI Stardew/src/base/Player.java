package base;

import tools.*;

public class Player
{
    private String name;
    private String gender;
    private String hobby;
    private int energy;

    private Axe axe = new Axe();
    private Pickaxe pickaxe = new Pickaxe();
    private FishingRod fishingRod = new FishingRod();
    private WateringCan wateringCan = new WateringCan();
    private Hoe hoe = new Hoe();
    private GrassCutter grassCutter = new GrassCutter();
    private Sword sword = new Sword();

    public Player(String name, String gender, String hobby)
    {
        this.name = name;
        this.gender = gender;
        this.hobby = hobby;
        this.energy = 100;
    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public int getEnergy()
    {
        return energy;
    }

    public void useEnergy(int amount)
    {
        energy = Math.max(energy - amount, 0);
    }

    public void sleep()
    {
        energy = 100;
        System.out.println("Kamu tidur dan energi terisi penuh!");
    }

    public void farm()
    {
        hoe.use();
        wateringCan.use();
        useEnergy(15);
    }
    public void mine()
    {
        pickaxe.use();
        useEnergy(15);
    }
    public void fish()
    {
        fishingRod.use();
        useEnergy(10);
    }
    public void chopTree()
    {
        axe.use();
        useEnergy(15);
    }
    public void cutGrass()
    {
        grassCutter.use();
        useEnergy(10);
    }
    public void fight()
    {
        sword.use();
        useEnergy(20);
    }
    public void shop()
    {
        System.out.println("Kamu membeli bibit di kota."); useEnergy(5);
    }

    public void showStatus()
    {
        System.out.println("\n=== Status Pemain ===");
        System.out.println("Nama: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Hobi: " + hobby);
        System.out.println("Energi: " + energy);
        System.out.println("\n=== Level Alat ===");
        System.out.println("Kapak: " + axe.getLevel());
        System.out.println("Cangkul: " + hoe.getLevel());
        System.out.println("Pancingan: " + fishingRod.getLevel());
        System.out.println("Penyiram: " + wateringCan.getLevel());
        System.out.println("Pemotong Rumput: " + grassCutter.getLevel());
        System.out.println("Cangkul Tambang: " + pickaxe.getLevel());
        System.out.println("Pedang: " + sword.getLevel());
    }
}