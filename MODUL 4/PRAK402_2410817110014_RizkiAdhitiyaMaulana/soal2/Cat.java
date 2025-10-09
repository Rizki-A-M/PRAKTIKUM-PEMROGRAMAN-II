package soal2;

public class Cat extends HewanPeliharaan
{
    private String furColor;

    public Cat(String name, String breed, String furColor)
    {
        super(name, breed);
        this.furColor = furColor;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.furColor);
    }
}
