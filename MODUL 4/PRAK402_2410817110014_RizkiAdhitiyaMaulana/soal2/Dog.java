package soal2;

public class Dog extends HewanPeliharaan
{
    private String furColoe;
    private String abilityAnimal;

    public Dog(String name, String breed, String furColoe, String abilityAnimal)
    {
        super(name, breed);
        this.furColoe = furColoe;
        this.abilityAnimal = abilityAnimal;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.furColoe);
        System.out.println("Memiliki kemampuan : " + this.abilityAnimal);
    }
}