package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2soal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> monthName = new HashMap<>();
        monthName.put(1, "Januari");
        monthName.put(2, "Februari");
        monthName.put(3, "Maret");
        monthName.put(4, "April");
        monthName.put(5, "Mei");
        monthName.put(6, "Juni");
        monthName.put(7, "Juli");
        monthName.put(8, "Agustus");
        monthName.put(9, "September");
        monthName.put(10, "Oktober");
        monthName.put(11, "November");
        monthName.put(12, "Desember");

        LinkedList<Country> countryList = new LinkedList<>();

        int countryCount = input.nextInt();
        input.nextLine();

        for (int i = 0; i < countryCount; i++)
        {
            String name = input.nextLine();
            String leadershipType = input.nextLine();
            String leaderName = input.nextLine();

            int independenceDay = 0;
            int independenceMonth = 0;
            int independenceYear = 0;

            if (!leadershipType.equalsIgnoreCase("monarki"))
            {
                independenceDay = input.nextInt();
                independenceMonth = input.nextInt();
                independenceYear = input.nextInt();
                input.nextLine();
            }

            countryList.add(new Country(name, leadershipType, leaderName, independenceDay, independenceMonth, independenceYear));
        }

        System.out.println();

        for (Country country : countryList)
        {
            String monthText = monthName.get(country.getIndependenceMonth());
            country.displayInfo(monthText);
        }

        input.close();
    }
}