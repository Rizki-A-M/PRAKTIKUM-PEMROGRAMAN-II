package soal1;

public class HewanPeliharaan
{
    private String name;
    private String breed;

    public HewanPeliharaan(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    public void display()
    {
        System.out.println();
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + getName());
        System.out.println("Dengan ras : " + getBreed());
    }
}