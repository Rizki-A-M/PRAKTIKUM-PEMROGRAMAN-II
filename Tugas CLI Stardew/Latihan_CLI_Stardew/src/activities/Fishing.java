package activities;
import base.Activity;
import base.Player;

public class Fishing extends Activity
{
    public Fishing()
    {
        super("Memancing");
    }

    public void perform(Player player)
    {
        System.out.println("Kamu memancing di perairan...");
        player.fish();
    }
}