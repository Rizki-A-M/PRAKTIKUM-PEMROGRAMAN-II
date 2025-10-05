package praktikum2.soal2;  // ubah 'Soal2' jadi 'soal2'

public class Coffee
{
    public String coffeeName;
    public String size;
    public double price;
    public String buyer;

    private final double TAX_RATE = 0.11;

    public void info()
    {
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }

    public void setBuyer(String buyer)
    {
        this.buyer = buyer;
    }

    public String getBuyer()
    {
        return buyer;
    }

    public double getTax()
    {
        return price * TAX_RATE;
    }
}
