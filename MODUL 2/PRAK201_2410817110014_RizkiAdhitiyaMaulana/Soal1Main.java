package praktikum2.soal1;

public class Soal1Main
{
    public static void main(String[] args)
    {
        Fruit apple = new Fruit();
        apple.setName("Apple");
        apple.setWeightFruit(0.4);
        apple.setPriceFruit(7000);
        apple.setTotalWeight(40.0);

        Fruit mango = new Fruit();
        mango.setName("Mango");
        mango.setWeightFruit(0.2);
        mango.setPriceFruit(3500);
        mango.setTotalWeight(15.0);

        Fruit avocado = new Fruit();
        avocado.setName("Avocado");
        avocado.setWeightFruit(0.25);
        avocado.setPriceFruit(10000);
        avocado.setTotalWeight(12.0);

        apple.display();
        mango.display();
        avocado.display();
    }
}