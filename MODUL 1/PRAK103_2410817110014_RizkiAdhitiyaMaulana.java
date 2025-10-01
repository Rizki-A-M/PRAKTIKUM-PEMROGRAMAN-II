import java.util.Scanner;

public class PRAK103_2410817110014_RizkiAdhitiyaMaulana
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int totalNumbers = input.nextInt();
        int startNumber = input.nextInt();

        System.out.println();

        int count = 0;

        do
        {
            if (startNumber % 2 != 0)
            {
                System.out.print(startNumber);
                count++;

                if (count < totalNumbers)
                {
                    System.out.print(", ");
                }
            }

            startNumber++;
        }
        while (count < totalNumbers);

    }
}