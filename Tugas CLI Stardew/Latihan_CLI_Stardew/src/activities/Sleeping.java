package activities;
import base.Activity;
import base.Player;

public class Sleeping extends Activity
{
    public Sleeping()
    {
        super("Tidur");
    }

    public void perform(Player player)
    {
        System.out.println("Kamu beristirahat...");
        player.sleep();
    }
}