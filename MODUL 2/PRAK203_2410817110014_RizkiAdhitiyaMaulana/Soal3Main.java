package praktikum2.soal3;

public class Soal3Main
{
    public static void main(String[] args)
    {
        Pegawai p1 = new Pegawai();

        //Pada baris ini terdapat error karena tidak adanya titik koma (;) di akhir pernyataan.
        //p1.nama = "Roi";
        p1.nama = "Roi";

        //Pada baris ini terdapat error apabila tipe data atribut "asal" masih menggunakan char.
        p1.asal = "Kingdom of Orvel";

        //Pada baris ini terdapat error karena method setJabatan belum ditambahkan parameter.
        p1.setJabatan("Assasin");

        //Pada baris ini kita menambahkan nilai untuk umur karena di class Employee kita belum menginisialisasikannya.
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}