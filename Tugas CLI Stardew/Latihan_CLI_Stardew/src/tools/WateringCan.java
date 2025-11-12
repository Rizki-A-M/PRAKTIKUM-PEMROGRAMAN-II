package tools;

import base.Tools;

public class WateringCan extends Tools
{
    public WateringCan()
    {
        super("Penyiram Tanaman");
    }

    public void use()
    {
        System.out.println("Kamu menyiram tanaman.");
        gainExp(15);
    }
}