package tools;

import base.Tools;

public class GrassCutter extends Tools
{
    public GrassCutter()
    {
        super("Pemotong Rumput");
    }

    public void use()
    {
        System.out.println("Kamu memotong rumput liar.");
        gainExp(10);
    }
}