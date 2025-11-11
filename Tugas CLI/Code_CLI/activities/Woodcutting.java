package activities;

import core.Player;

public class Woodcutting extends Activity
{
    @Override
    public void perform(Player player)
    {
        System.out.println("Kamu menebang pohon dan mendapatkan kayu!");
        player.reduceEnergy(12);
    }
}