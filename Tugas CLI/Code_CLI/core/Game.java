package core;

import java.util.Scanner;

public class Game
{
    private final Scanner scanner = new Scanner(System.in);
    private Player player;
    private MenuHandler menuHandler;

    public void start()
    {
        createCharacter();
        menuHandler = new MenuHandler(this, scanner);
        menuHandler.showMainMenu();
    }

    private void createCharacter()
    {
        System.out.println("=== SELAMAT DATANG DI STARDUST VALLEY ===");

        System.out.print("Masukkan nama karakter Anda: ");
        String name = scanner.nextLine();

        System.out.print("Pilih gender (L/P): ");
        String genderInput = scanner.nextLine();

        String gender;
        if (genderInput.equalsIgnoreCase("L"))
        {
            gender = "Laki-laki";
        }
        else if (genderInput.equalsIgnoreCase("P"))
        {
            gender = "Perempuan";
        }
        else
        {
            gender = "Tidak diketahui";
        }

        System.out.print("Masukkan hobi utama karakter Anda: ");
        String hobby = scanner.nextLine();

        this.player = new Player(name, gender, hobby);
        System.out.println("\nKarakter berhasil dibuat!");
        System.out.println("Nama  : " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Hobi  : " + hobby);
    }

    public Player getPlayer()
    {
        return player;
    }
}