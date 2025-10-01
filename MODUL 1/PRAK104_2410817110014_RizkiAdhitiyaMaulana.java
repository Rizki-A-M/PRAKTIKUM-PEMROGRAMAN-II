import java.util.Scanner;

public class PRAK104_2410817110014_RizkiAdhitiyaMaulana
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] abu = sc.nextLine().split(" ");

        System.out.print("Tangan Bagas: ");
        String[] bagas = sc.nextLine().split(" ");

        System.out.println();

        int scoreAbu = 0;
        int scoreBagas = 0;

        for (int i = 0; i < 3; i++)
        {
            String choiceAbu = abu[i];
            String choiceBagas = bagas[i];

            if (choiceAbu.equals(choiceBagas))
            {
                continue;
            }
            else if ((choiceAbu.equals("B") && choiceBagas.equals("G")) || (choiceAbu.equals("G") && choiceBagas.equals("K")) || (choiceAbu.equals("K") && choiceBagas.equals("B")))
            {
                scoreAbu++;
            }
            else
            {
                scoreBagas++;
            }
        }

        if (scoreAbu > scoreBagas)
        {
            System.out.println("Abu");
        }
        else if (scoreBagas > scoreAbu)
        {
            System.out.println("Bagas");
        }
        else
        {
            System.out.println("Seri");
        }
    }
}