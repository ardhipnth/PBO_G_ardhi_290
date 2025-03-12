import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek rekening1 dari kelas RekeningBank
        RekeningBank rekening1 = new RekeningBank();
        Scanner objinput =new Scanner(System.in);
        // Mengatur informasi rekening1
        rekening1.nomorRekening = "202410370110290";
        rekening1.namaPemilik = "Muhammad Ardhi Pontoh";
        rekening1.saldo = 200000;

        // Menampilkan nama pemilik rekening1
        System.out.println("Muhammad Ardhi Pontoh");
        // Melakukan penyetoran uang ke rekening1 sebesar 100000
        System.out.print("masukan jumlah setor: Rp.");
        double jumlahSetor1 = objinput.nextDouble();
        rekening1.setorUang(jumlahSetor1);
        // Menampilkan nama pemilik rekening1
        System.out.println("Muhammad Ardhi Pontoh");
        System.out.print("masukan jumlah tarikUang: Rp.");
        double jumlahTarik1 = objinput.nextDouble();
        // Melakukan penarikan uang dari rekening1 sebesar 400000
        rekening1.tarikUang(jumlahTarik1);

        // Menampilkan informasi rekening1
        System.out.println("Informasi Rekening 1:");
        rekening1.tampilkanInfo();

        // Menambahkan baris pemisah
        System.out.println("\n------------------\n");

        // Membuat objek rekening2 dari kelas RekeningBank
        RekeningBank rekening2 = new RekeningBank();

        // Mengatur informasi rekening2
        rekening2.nomorRekening = "202410370110324";
        rekening2.namaPemilik = "Alinno Faza";
        rekening2.saldo = 100000;

        // Menampilkan nama pemilik rekening2
        System.out.println("Alinno Faza");
        System.out.print("masukan jumlah setor: Rp.");
        double jumlahSetor2 = objinput.nextDouble();
        System.out.print("masukan jumlah setor: Rp.");
        // Melakukan penyetoran uang ke rekening2 sebesar 400000
        rekening2.setorUang(jumlahSetor2);
        // Menampilkan nama pemilik rekening2
        System.out.println("Alinno Faza");
        System.out.print("masukan jumlah tarikUang: Rp.");
        double jumlahTarik2 = objinput.nextDouble();
        // Melakukan penarikan uang dari rekening2 sebesar 100000
        rekening2.tarikUang(jumlahTarik2);

        // Menampilkan informasi rekening2
        System.out.println("Informasi Rekening 2:");
        rekening2.tampilkanInfo();
    }
}