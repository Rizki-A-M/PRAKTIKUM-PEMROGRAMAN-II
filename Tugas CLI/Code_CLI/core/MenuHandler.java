package core;

import java.util.Scanner;
import activities.*;
import tools.*;

public class MenuHandler
{
    private final Game game;
    private final Scanner scanner;

    public MenuHandler(Game game, Scanner scanner)
    {
        this.game = game;
        this.scanner = scanner;
    }

    public void showMainMenu()
    {
        while (true)
        {
            System.out.println("\n=== STARDUST VALLEY CLI ===");
            System.out.println("1. Lakukan Aktivitas");
            System.out.println("2. Lihat Status Pemain");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            String choice = scanner.nextLine();

            if (choice.equals("1"))
            {
                showActivityMenu();
            }
            else if (choice.equals("2"))
            {
                game.getPlayer().showStatus();
            }
            else if (choice.equals("0"))
            {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
            else
            {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private void showActivityMenu()
    {
        System.out.println("\n=== PILIH AKTIVITAS ===");
        System.out.println("1. Bertani");
        System.out.println("2. Menambang");
        System.out.println("3. Memancing");
        System.out.println("4. Menebang Pohon");
        System.out.print("Pilih aktivitas: ");

        String choice = scanner.nextLine();

        Activity activity = null;
        Usable tool = null;

        if (choice.equals("1"))
        {
            activity = new Farming();
            tool = new WateringCan();
        }
        else if (choice.equals("2"))
        {
            activity = new Mining();
            tool = new Pickaxe();
        }
        else if (choice.equals("3"))
        {
            activity = new Fishing();
            tool = new FishingRod();
        }
        else if (choice.equals("4"))
        {
            activity = new Woodcutting();
            tool = new Axe();
        }
        else
        {
            System.out.println("Aktivitas tidak dikenal!");
        }

        if (tool != null)
        {
            tool.use();
        }

        if (activity != null)
        {
            activity.perform(game.getPlayer());
        }
    }

}