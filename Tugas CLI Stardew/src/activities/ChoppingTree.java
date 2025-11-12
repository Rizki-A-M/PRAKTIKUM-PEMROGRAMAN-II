package activities;
import base.Activity;
import base.Player;

public class ChoppingTree extends Activity
{
    public ChoppingTree()
    {
        super("Menebang Pohon");
    }

    public void perform(Player player)
    {
        System.out.println("Kamu menebang pohon besar...");
        player.chopTree();
    }
}