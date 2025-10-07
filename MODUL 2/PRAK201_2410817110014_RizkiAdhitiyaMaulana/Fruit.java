package praktikum2.soal1;

public class Fruit
{
    public String name;
    public double weightFruit;
    public double priceFruit;
    public double totalWeight;

    public String getName()
    {
        return name;
    }

    public double getWeightFruit()
    {
        return weightFruit;
    }

    public double getPriceFruit()
    {
        return priceFruit;
    }

    public double getTotalWeight()
    {
        return totalWeight;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setWeightFruit(double weightFruit)
    {
        this.weightFruit = weightFruit;
    }

    public void setPriceFruit(double priceFruit)
    {
        this.priceFruit = priceFruit;
    }

    public void setTotalWeight(double totalWeight)
    {
        this.totalWeight = totalWeight;
    }

    public double priceBeforeDiscount()
    {
        return priceFruit * (totalWeight / weightFruit);
    }

    public double totalDiscount()
    {
        double lotsOfDiscount = totalWeight / 4;
        return (int) lotsOfDiscount * (priceFruit * 4) * 0.02;
    }

    public double priceAfterDiscount()
    {
        return priceBeforeDiscount() - totalDiscount();
    }

    public void display()
    {
        System.out.println("Nama Buah: " + getName());
        System.out.println("Berat: " + getWeightFruit());
        System.out.println("Harga: " + getPriceFruit());
        System.out.println("Jumlah Beli: " + getTotalWeight() + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", priceBeforeDiscount());
        System.out.printf("Total Diskon: Rp%.2f\n", totalDiscount());
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", priceAfterDiscount());
    }
}