package praktikum2.soal3;

public class Soal3Main
{
    public static void main(String[] args)
    {
        //Error: Class Pegawai tidak ada, nama class di Pegawai.java adalah Employee
        Employee p1 = new Employee(); // diperbaiki: sesuaikan nama class

        //Error: Tidak ada titik koma di akhir statement
        p1.nama = "Roi"; // diperbaiki: tambahkan ;

        p1.asal = "Kingdom of Orvel";

        //Method setJabatan sudah diperbaiki untuk menerima parameter
        p1.setJabatan("Assasin");

        //Error: umur belum diisi sebelum dicetak
        p1.umur = 17; // diperbaiki: beri nilai umur sebelum print

        //Menampilkan output sesuai soal
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}