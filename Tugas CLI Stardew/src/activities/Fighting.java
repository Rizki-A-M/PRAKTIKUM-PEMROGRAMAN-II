package activities;
import base.Activity;
import base.Player;

public class Fighting extends Activity
{
    public Fighting()
    {
        super("Menyerang Monster");
    }

    public void perform(Player player)
    {
        System.out.println("Kamu bertarung di tambang!");
        player.fight();
    }
}