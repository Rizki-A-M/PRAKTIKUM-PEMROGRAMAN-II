package praktikum2.soal2;

public class Soal2Main
{
    public static void main(String[] args)
    {
        Coffee coffee1 = new Coffee();
        coffee1.coffeeName = "Espresso";
        coffee1.size = "Medium";
        coffee1.price = 25000;

        coffee1.info();
        coffee1.setBuyer("Alice");
        System.out.println("Buyer: " + coffee1.getBuyer());
        System.out.println("Tax: Rp. " + coffee1.getTax());
    }
}