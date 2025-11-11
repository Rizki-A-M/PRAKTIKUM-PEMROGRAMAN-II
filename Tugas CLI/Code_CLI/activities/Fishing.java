package activities;

import core.Player;

public class Fishing extends Activity
{
    @Override
    public void perform(Player player)
    {
        System.out.println("Kamu memancing dan mendapatkan ikan!");
        player.reduceEnergy(8);
    }
}