package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1soal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        LinkedList<Dice> diceList = new LinkedList<>();

        int diceCount = input.nextInt();
        System.out.println();

        for (int i = 0; i < diceCount; i++)
        {
            diceList.add(new Dice());
        }

        Dice rollDice = new Dice();
        rollDice.displayDice(diceList);

        input.close();
    }
}