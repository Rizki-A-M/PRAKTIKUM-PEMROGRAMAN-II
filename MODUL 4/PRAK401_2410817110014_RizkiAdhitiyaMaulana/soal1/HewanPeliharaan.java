package soal1;

public class HewanPeliharaan
{
    public String name;
    public String breed;

    public HewanPeliharaan(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public void display()
    {
        System.out.println();
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + this.name);
        System.out.println("Dengan ras : " + this.breed);
    }
}
