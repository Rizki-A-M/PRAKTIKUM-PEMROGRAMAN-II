package base;

import java.util.Scanner;
import activities.*;

public enum Location
{
    HOME("Rumah", new Activity[]{ new Sleeping() }),
    FARM("Kebun", new Activity[]{ new Farming(), new ChoppingTree(), new CuttingGrass(), new Fishing(), new Mining() }),
    MINE("Tambang", new Activity[]{ new Mining(), new Fighting(), new Fishing() }),
    SEA("Laut & Sungai", new Activity[]{ new Fishing() }),
    CITY("Kota", new Activity[]{ new Shopping() }),
    MOUNTAIN("Pegunungan", new Activity[]{ new ChoppingTree() });

    private String name;
    private Activity[] activities;

    Location(String name, Activity[] activities)
    {
        this.name = name;
        this.activities = activities;
    }

    public String getName()
    {
        return name;
    }

    public void showActivities(Player player, Scanner scanner)
    {
        System.out.println("\nAktivitas di " + name + ":");
        for (int i = 0; i < activities.length; i++)
        {
            System.out.println((i + 1) + ". " + activities[i].getName());
        }
        System.out.print("Pilih aktivitas: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice > 0 && choice <= activities.length)
        {
            activities[choice - 1].perform(player);
        }
        else
        {
            System.out.println("Pilihan tidak valid.");
        }
    }

    public static Location chooseLocation(Scanner scanner)
    {
        System.out.println("\nPilih lokasi:");
        Location[] locations = values();
        for (int i = 0; i < locations.length; i++)
        {
            System.out.println((i + 1) + ". " + locations[i].getName());
        }
        System.out.print("Pilih: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice > 0 && choice <= locations.length)
        {
            return locations[choice - 1];
        }
        else
        {
            System.out.println("Pilihan tidak valid, tetap di lokasi sekarang.");
            return Location.HOME;
        }
    }
}