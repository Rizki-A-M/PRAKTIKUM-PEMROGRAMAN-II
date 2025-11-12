package tools;

import base.Tools;

public class Hoe extends Tools
{
    public Hoe()
    {
        super("Cangkul");
    }

    public void use()
    {
        System.out.println("Kamu mencangkul tanah untuk menanam.");
        gainExp(10);
    }
}