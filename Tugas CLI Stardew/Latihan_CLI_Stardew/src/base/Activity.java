package base;

public abstract class Activity
{
    protected String name;

    public Activity(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public abstract void perform(Player player);
}