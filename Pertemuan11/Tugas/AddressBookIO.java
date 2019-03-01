package Pertemuan11.Tugas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AddressBookIO {

    public static void main(String[] args) throws IOException {
        Scanner inputPilihan = new Scanner(System.in);

        do {
            System.out.println("==================================");
            System.out.println("     Program Address Book I/O     ");
            System.out.println("==================================");
            System.out.println("1 Tambah Address Book");
            System.out.println("2 Tampilkan Address Book ");
            System.out.println("3 Keluar");
            System.out.println("");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = inputPilihan.nextInt();
            switch (pilihan) {
                case 1:
                    TambahData();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Data Address Book:");
                    TampilkanData();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak ada, Mohon masukkan angka kembali");
                    break;
            }
            System.out.println("");
        } while (true);
    }

    public static void TambahData() {
        try (FileOutputStream data = new FileOutputStream("addressbook.dat", true)) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine() + "\t";

            System.out.print("Masukkan Alamat: ");
            String alamat = input.nextLine() + "\t";

            System.out.print("Masukkan Telepon: ");
            String telepon = input.nextLine() + "\t";

            System.out.print("Masukkan Email: ");
            String email = input.nextLine() + "\n";

            data.write(nama.getBytes());
            data.write(alamat.getBytes());
            data.write(telepon.getBytes());
            data.write(email.getBytes());

            data.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void TampilkanData() throws IOException {
        try (FileInputStream i = new FileInputStream("addressbook.dat")) {

            int data;

            while ((data = i.read()) != -1) {
                System.out.print((char) data);
            }

            i.close();
        } catch (FileNotFoundException e) {
            System.out.println("Data belum ada pada Address Book");
        }
    }
}
