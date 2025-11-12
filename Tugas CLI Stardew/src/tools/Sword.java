package tools;

import base.Tools;

public class Sword extends Tools
{
    public Sword()
    {
        super("Pedang");
    }

    public void use()
    {
        System.out.println("Kamu menyerang monster!");
        gainExp(40);
    }
}