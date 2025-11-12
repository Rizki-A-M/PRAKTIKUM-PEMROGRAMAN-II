package activities;
import base.Activity;
import base.Player;

public class Farming extends Activity
{
    public Farming()
    {
        super("Bertani");
    }

    public void perform(Player player)
    {
        System.out.println("Kamu mulai bertani...");
        player.farm();
    }
}