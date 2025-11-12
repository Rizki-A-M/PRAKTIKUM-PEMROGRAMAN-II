package tools;

import base.Tools;

public class FishingRod extends Tools
{
    public FishingRod()
    {
        super("Pancingan");
    }

    public void use()
    {
        System.out.println("Kamu memancing di sungai...");
        gainExp(30);
    }
}