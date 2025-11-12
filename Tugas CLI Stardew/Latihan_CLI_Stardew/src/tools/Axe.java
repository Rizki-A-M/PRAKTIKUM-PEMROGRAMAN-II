package tools;

import base.Tools;

public class Axe extends Tools
{
    public Axe()
    {
        super("Kapak");
    }

    public void use()
    {
        System.out.println("Kamu menebang pohon dengan Kapak.");
        gainExp(25);
    }
}