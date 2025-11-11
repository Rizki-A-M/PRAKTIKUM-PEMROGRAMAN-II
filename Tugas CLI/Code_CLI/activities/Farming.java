package activities;

import core.Player;

public class Farming extends Activity
{
    @Override
    public void perform(Player player)
    {
        System.out.println("Kamu menanam tanaman dan menyiram tanaman!");
        player.reduceEnergy(10);
    }
}