package soal1;

import java.util.LinkedList;
import java.util.Random;

public class Dice
{
    private int value;

    public Dice()
    {
        roll();
    }

    public int getValue()
    {
        return value;
    }

    public void roll()
    {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;
    }

    public void displayDice(LinkedList<Dice> diceList)
    {
        int total = 0;
        for (int i = 0; i < diceList.size(); i++)
        {
            int currentValue = diceList.get(i).getValue();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + currentValue);
            total += currentValue;
        }
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
