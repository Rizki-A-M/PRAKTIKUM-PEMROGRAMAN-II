package base;

public abstract class Tools implements Usable
{
    protected String name;
    protected int exp;
    protected int level;

    public Tools(String name)
    {
        this.name = name;
        this.exp = 0;
        this.level = 1;
    }

    protected void gainExp(int amount)
    {
        exp += amount;
        System.out.println(name + " mendapat " + amount + " EXP ");
        if (exp >= 100) {
            exp -= 100;
            level++;
            System.out.println("✨ Level " + name + " naik menjadi level " + level + "!");
        }
    }

    public int getLevel()
    {
        return level;
    }

    public String getName()
    {
        return name;
    }
}