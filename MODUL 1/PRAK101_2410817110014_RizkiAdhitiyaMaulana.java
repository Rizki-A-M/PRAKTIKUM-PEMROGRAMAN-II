import java.util.Scanner;

public class PRAK101_2410817110014_RizkiAdhitiyaMaulana
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int birthDate = input.nextInt();

        System.out.print("Masukkan Bulan Lahir (angka): ");
        int birthMonth = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int birthYear = input.nextInt();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        int height = input.nextInt();

        System.out.print("Masukkan Berat Badan (kg): ");
        double weight = input.nextDouble();

        String birthMonthName;
        switch (birthMonth)
        {
            case 1: birthMonthName = "Januari";
                break;
            case 2: birthMonthName = "Februari";
                break;
            case 3: birthMonthName = "Maret";
                break;
            case 4: birthMonthName = "April";
                break;
            case 5: birthMonthName = "Mei";
                break;
            case 6: birthMonthName = "Juni";
                break;
            case 7: birthMonthName = "Juli";
                break;
            case 8: birthMonthName = "Agustus";
                break;
            case 9: birthMonthName = "September";
                break;
            case 10: birthMonthName = "Oktober";
                break;
            case 11: birthMonthName = "November";
                break;
            case 12: birthMonthName = "Desember";
                break;
            default: birthMonthName = "Bulan tidak valid";
                break;
        }

        System.out.println();
        System.out.println("Nama Lengkap " + name + ", Lahir di " + birthPlace + " pada Tanggal " + birthDate + " " + birthMonthName + " " + birthYear);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");

    }
}