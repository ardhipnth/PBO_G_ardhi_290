public class hewan {

    // Atribut (variabel) untuk menyimpan informasi tentang hewan
    String NamaHewan; // Nama hewan (misalnya: Kucing, Anjing, dll.)
    String Jenis;     // Jenis hewan (misalnya: Mamalia, Reptil, dll.)
    String Suara;     // Suara yang dihasilkan hewan (misalnya: Meow, Guk, dll.)
    String warna;     // warna hewan tersebut (misalnya : putih, hitam)
    int JumlahKaki;   // Jumlah kaki hewan
    // Metode untuk menampilkan informasi hewan
    void tampilkanInfo() {
        // Menampilkan nama hewan ke layar
        System.out.println("Nama Hewan: " + NamaHewan);
        // Menampilkan jenis hewan ke layar
        System.out.println("Jenis: " + Jenis);
        // Menampilkan suara hewan ke layar
        System.out.println("Suara: " + Suara);
        // Menampilkan warna  hewan ke layar
        System.out.println("Warna: " + warna);
        // Menampilkan jumlah kaki hewan ke layar
        System.out.println("JumlahKaki: " + JumlahKaki);

        // Menambahkan baris kosong untuk pemisah antar hewan
        System.out.println();
    }
}