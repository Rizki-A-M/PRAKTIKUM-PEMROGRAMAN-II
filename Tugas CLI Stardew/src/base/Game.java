package base;

import java.util.Scanner;

public class Game
{
    private Player player;
    private Scanner scanner = new Scanner(System.in);
    private Location currentLocation;

    public void start()
    {
        System.out.println("=== Selamat Datang di Stardew ===");
        System.out.print("Masukkan nama karakter: ");
        String name = scanner.nextLine();

        String gender = "";
        while(true)
        {
            System.out.print("Pilih gender (L/P): ");
            String genderInput = scanner.nextLine();
            if(genderInput.equalsIgnoreCase("L"))
            {
                gender = "Laki-laki";
                break;
            }
            else if(genderInput.equalsIgnoreCase("P"))
            {
                gender = "Perempuan";
                break;
            }
            else
            {
                System.out.println("Pilihan tidak valid. Masukkan L atau P.");
            }
        }

        System.out.print("Masukkan hobi kamu: ");
        String hobby = scanner.nextLine();

        player = new Player(name, gender, hobby);
        currentLocation = Location.HOME;

        System.out.println("\nHai " + name + "! Petualangan dimulai dari rumahmu.");
        mainMenu();
    }

    private void mainMenu()
    {
        while (true)
        {
            System.out.println("\n=== Lokasi Saat Ini: " + currentLocation.getName() + " ===");
            System.out.println("Energi: " + player.getEnergy());
            System.out.println("1. Lihat aktivitas di sini");
            System.out.println("2. Pindah lokasi");
            System.out.println("3. Lihat status alat");
            System.out.println("0. Keluar game");
            System.out.print("Pilih: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    currentLocation.showActivities(player, scanner);
                    break;
                case 2:
                    currentLocation = Location.chooseLocation(scanner);
                    break;
                case 3:
                    player.showStatus();
                    break;
                case 0:
                    System.out.println("Sampai jumpa, " + player.getName() + "!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}