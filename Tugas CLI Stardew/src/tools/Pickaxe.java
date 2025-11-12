package tools;

import base.Tools;

public class Pickaxe extends Tools
{
    public Pickaxe()
    {
        super("Cangkul Tambang");
    }

    public void use()
    {
        System.out.println("Kamu menambang batu menggunakan Cangkul Tambang.");
        gainExp(20);
    }
}