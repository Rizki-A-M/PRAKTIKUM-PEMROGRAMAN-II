package activities;
import base.Activity;
import base.Player;

public class Mining extends Activity
{
    public Mining()
    {
        super("Menambang");
    }

    public void perform(Player player)
    {
        System.out.println("Kamu menambang di tambang...");
        player.mine();
    }
}