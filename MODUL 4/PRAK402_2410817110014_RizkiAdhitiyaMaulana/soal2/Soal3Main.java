package soal2;

import java.util.Scanner;

public class Soal3Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true)
        {
            System.out.println("Pilih jenis hewan yang ingin diinputkan:");
            System.out.println("1 = Kucing");
            System.out.println("2 = Anjing");
            System.out.print("Masukkan pilihan: ");

            if (input.hasNextInt())
            {
                choice = input.nextInt();
                input.nextLine();
                if (choice == 1 || choice == 2) break;
            }
            else
            {
                input.nextLine();
            }
        }

        String name = "";
        while (name.isEmpty())
        {
            System.out.print("Nama hewan peliharaan: ");
            name = input.nextLine().trim();
        }

        String breed = "";
        while (breed.isEmpty())
        {
            System.out.print("Ras: ");
            breed = input.nextLine().trim();
        }

        if (choice == 1)
        {
            String furColor = "";
            while (furColor.isEmpty())
            {
                System.out.print("Warna Bulu: ");
                furColor = input.nextLine().trim();
            }

            Cat myCat = new Cat(name, breed, furColor);
            myCat.display();
        }

        else if (choice == 2)
        {
            String furColor = "";
            while (furColor.isEmpty())
            {
                System.out.print("Warna Bulu: ");
                furColor = input.nextLine().trim();
            }

            String abilityAnimal = "";
            while (abilityAnimal.isEmpty())
            {
                System.out.print("Kemampuan: ");
                abilityAnimal = input.nextLine().trim();
            }

            Dog myDog = new Dog(name, breed, furColor, abilityAnimal);
            myDog.display();
        }

        input.close();
    }
}