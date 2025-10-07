package praktikum2.soal3;

//Pada baris ini terdapat error karena perbedaan nama class dengan nama file.
//public class Employess
public class Pegawai
{
    public String nama;

    //Pada baris ini terdapat error karena perbedaan tipe data char untuk atribut dengan bagian method yang memakai string.
    //public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama()
    {
        return nama;
    }

    //Pada baris ini terdapat error karena method getAsal() mengembalikan String sedangkan atribut asal bertipe char.
    public String getAsal()
    {
        return asal;
    }

    //Pada baris ini terdapat error karena method setJabatan() tidak memiliki parameter untuk menerima nilai jabatan.
    //public void setJabatan()
    public void setJabatan(String j)
    {
        this.jabatan = j;
    }
}