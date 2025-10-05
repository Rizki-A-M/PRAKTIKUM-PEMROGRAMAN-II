package praktikum2.soal3;

public class Employee {
    public String nama;

    //Error: Tipe data char tidak sesuai dengan getter getAsal() yang mengembalikan String
    public String asal; // diperbaiki menjadi String agar konsisten

    public String jabatan;
    public int umur;

    public String getNama()
    {
        return nama;
    }

    //Error: Getter getAsal() mengembalikan String, tapi asal awalnya char
    public String getAsal()
    {
        return asal; // diperbaiki agar konsisten dengan tipe data atribut
    }

    //Error: Method setJabatan() tidak menerima parameter, tapi mencoba mengakses variabel 'j'
    public void setJabatan(String j)
    {
        this.jabatan = j; // diperbaiki: tambahkan parameter 'j'
    }
}