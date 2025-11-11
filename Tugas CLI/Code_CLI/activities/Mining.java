package activities;

import core.Player;

public class Mining extends Activity
{
    @Override
    public void perform(Player player)
    {
        System.out.println("Kamu menambang dan menemukan batu!");
        player.reduceEnergy(15);
    }
}