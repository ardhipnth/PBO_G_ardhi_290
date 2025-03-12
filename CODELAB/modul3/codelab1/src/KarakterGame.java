public class KarakterGame {
    private String name; // Variabel untuk menyimpan nama karakter
    private int kesehatan; // Variabel untuk menyimpan kesehatan karakter

    // Konstruktor untuk membuat objek KarakterGame
    public KarakterGame(String name, int kesehatan) {
        this.name = name; // Menginisialisasi nama karakter
        this.kesehatan = kesehatan; // Menginisialisasi kesehatan karakter
    }

    // Metode untuk mengatur nama karakter
    public void setName(String name) {
        this.name = name;
    }

    // Metode untuk mendapatkan nama karakter
    public String getName() {
        return name;
    }

    // Metode untuk mengatur kesehatan karakter
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Metode untuk mendapatkan kesehatan karakter
    public int getKesehatan() {
        return kesehatan;
    }

    // Metode untuk serangan umum (dapat di-override oleh kelas turunan)
    public void serang(KarakterGame target) {
        System.out.println(getName() + " menyerang " + target.getName());
    }
}