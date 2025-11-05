package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3soal
{
    public static void main(String[] args)
    {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            String choice = input.nextLine();

            switch (choice)
            {
                case "1":
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    boolean nimExists = false;
                    for (int i = 0; i < studentList.size(); i++)
                    {
                        if (studentList.get(i).getNim().equals(nim))
                        {
                            nimExists = true;
                            break;
                        }
                    }

                    if (nimExists)
                    {
                        System.out.println("NIM sudah digunakan. Mahasiswa tidak ditambahkan.");
                    }

                    else
                    {
                        studentList.add(new Student(name, nim));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;

                case "2":
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimDelete = input.nextLine();
                    boolean foundDelete = false;

                    for (int i = 0; i < studentList.size(); i++)
                    {
                        if (studentList.get(i).getNim().equals(nimDelete))
                        {
                            studentList.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + nimDelete + " dihapus.");
                            foundDelete = true;
                            break;
                        }
                    }

                    if (!foundDelete)
                    {
                        System.out.println("Mahasiswa dengan NIM " + nimDelete + " tidak ditemukan.");
                    }
                    break;

                case "3":
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nimSearch = input.nextLine();
                    boolean found = false;

                    for (int i = 0; i < studentList.size(); i++)
                    {
                        if (studentList.get(i).getNim().equals(nimSearch))
                        {
                            System.out.println("Mahasiswa ditemukan:");
                            System.out.println("NIM: " + studentList.get(i).getNim() + ", Nama: " + studentList.get(i).getName());
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                    {
                        System.out.println("Mahasiswa dengan NIM " + nimSearch + " tidak ditemukan.");
                    }
                    break;

                case "4":
                    System.out.println("Daftar Mahasiswa:");
                    if (studentList.isEmpty())
                    {
                        System.out.println("(Belum ada data mahasiswa)");
                    }

                    else
                    {
                        for (int i = 0; i < studentList.size(); i++)
                        {
                            System.out.println("NIM: " + studentList.get(i).getNim() + ", Nama: " + studentList.get(i).getName());
                        }
                    }
                    break;

                case "0":
                    studentList.clear();
                    System.out.println("Terima kasih!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}