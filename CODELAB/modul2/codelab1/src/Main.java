public class Main {
    public static void main(String[] args) {
        // Membuat objek hewan1 dari kelas hewan
        hewan hewan1 = new hewan();
        // Membuat objek hewan2 dari kelas hewan
        hewan hewan2 = new hewan();

        // Mengatur nama hewan1 menjadi "Kucing"
        hewan1.NamaHewan = "Kucing";
        // Mengatur nama hewan2 menjadi "Anjing"
        hewan2.NamaHewan = "Anjing";

        // Mengatur jenis hewan1 menjadi "Mamalia"
        hewan1.Jenis = "Mamalia";
        // Mengatur jenis hewan2 menjadi "Mamalia"
        hewan2.Jenis = "Mamalia";

        // Mengatur suara hewan1 menjadi "nyann~~"
        hewan1.Suara = "nyann~~";
        // Mengatur suara hewan2 menjadi "Woof-Woof!!"
        hewan2.Suara = "Woof-Woof!!";

        hewan1.warna = "oren";
        hewan2.warna = "coklat~~";

        hewan1.JumlahKaki = "Berkaki 4";
        hewan2.JumlahKaki = "Berkaki 4";

        System.out.println("hallo Mr Ardhii!");
        // Memanggil metode tampilkanInfo() untuk menampilkan informasi hewan1
        hewan1.tampilkanInfo();

        // Memanggil metode tampilkanInfo() untuk menampilkan informasi hewan2
        hewan2.tampilkanInfo();
    }
}