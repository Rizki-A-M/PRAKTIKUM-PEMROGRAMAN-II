import java.util.Scanner;

public class PRAK102_2410817110014_RizkiAdhitiyaMaulana
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println();

        int count = 0;
        while (count < 11)
        {
            if (number % 5 == 0)
            {
                System.out.print(number / 5 - 1);
            }
            else
            {
                System.out.print(number);
            }

            if (count < 10)
            {
                System.out.print(", ");
            }

            number++;
            count++;
        }
    }
}