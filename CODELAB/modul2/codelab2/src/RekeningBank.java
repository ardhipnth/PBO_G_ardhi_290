public class RekeningBank {
    // Atribut (variabel) untuk menyimpan informasi rekening bank
    String nomorRekening; // Nomor rekening bank
    String namaPemilik;   // Nama pemilik rekening
    double saldo;         // Saldo rekening

    // Metode untuk menampilkan informasi rekening bank
    void tampilkanInfo() {
        System.out.println("informasi rekening");
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
    }

    // Metode untuk menyetor uang ke rekening
    void setorUang(double jumlah) {
        saldo += jumlah; // Menambahkan jumlah uang ke saldo
        System.out.println("Setor tunai sebesar Rp " + jumlah + " Setor tunai berhasil.");
        System.out.println("Saldo baru: Rp " + saldo);
    }

    // Metode untuk menarik uang dari rekening
    void tarikUang(double jumlah) {
        // Memeriksa apakah saldo mencukupi untuk penarikan
        if (saldo >= jumlah) {
            saldo -= jumlah; // Mengurangi jumlah uang dari saldo
            System.out.println("Tarik tunai sebesar Rp " + jumlah + " Tarik tunai berhasil.");
            System.out.println("Saldo baru: Rp " + saldo);
        } else {
            System.out.println("Tarik tunai Gagal, saldo tidak mencukupi");
        }
    }
}