import java.util.Scanner;

public class PRAK105_2410817110014_RizkiAdhitiyaMaulana
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        final double PHI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        double radius = sc.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = sc.nextDouble();

        System.out.println();

        double volume = PHI * radius * radius * height;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan\ntinggi %.1f cm adalah %.3f m3", radius, height, volume);
    }
}