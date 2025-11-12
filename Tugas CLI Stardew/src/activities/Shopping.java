package activities;
import base.Activity;
import base.Player;

public class Shopping extends Activity
{
    public Shopping()
    {
        super("Belanja Bibit");
    }

    public void perform(Player player)
    {
        player.shop();
    }
}