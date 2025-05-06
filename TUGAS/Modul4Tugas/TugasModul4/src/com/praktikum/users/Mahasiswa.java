package com.praktikum.users;
import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private  String Nama;
    private  String Nim;

    public Mahasiswa(String Nama, String Nim){
        this.Nama = Nama;
        this.Nim = Nim;
    }

    public String getNama() {
        return Nama;
    }

    public String getNim() {
        return Nim;
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public boolean login(String Nama, String Nim) {
        if(getNama().equalsIgnoreCase(Nama) && getNim().equalsIgnoreCase(Nim)) {
            System.out.println("Login berhasil");
            return true;
        } else {
            System.out.println("Login gagal, nama atau nim salah coba lagi");
            return false;
        }
    }

    @Override
    public void diplayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n===== Menu Mahasiswa =====");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih menu: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout berhasil");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }

    @Override
    public void reportItem() {

        System.out.println("\n===== Laporkan Barang =====");
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Deskripsi Barang: ");
        String deskripsiBarang = scanner.nextLine();

        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.println("\nKonfirmasi Laporan:");
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Deskripsi: " + deskripsiBarang);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Laporan berhasil disimpan!");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }


}