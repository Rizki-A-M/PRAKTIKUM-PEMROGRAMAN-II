package activities;
import base.Activity;
import base.Player;

public class CuttingGrass extends Activity
{
    public CuttingGrass()
    {
        super("Menebas Rumput");
    }

    public void perform(Player player)
    {
        System.out.println("Kamu menebas rumput di ladang...");
        player.cutGrass();
    }
}