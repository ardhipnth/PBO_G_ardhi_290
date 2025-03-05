
import java.time.LocalDateTime; // Mengimpor kelas untuk mendapatkan waktu saat ini
import java.time.format.DateTimeFormatter; // Mengimpor kelas untuk memformat waktu dan tanggal
import java.util.Scanner; // Mengimpor kelas untuk membaca input dari pengguna

public class MODUL1 {
    public static void main(String[] args){
        String nama; // Mendeklarasikan variabel untuk menyimpan nama pengguna
        String JenisKelamin; // Mendeklarasikan variabel untuk menyimpan jenis kelamin pengguna
        int tahunLahir; // Mendeklarasikan variabel untuk menyimpan tahun lahir pengguna
        Scanner objInput = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        LocalDateTime timeNow = LocalDateTime.now(); // Mendapatkan waktu saat ini
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Membuat format untuk waktu dan tanggal
        System.out.print("Masukkan nama: "); // Menampilkan teks untuk meminta nama pengguna
        nama = objInput.nextLine(); // Membaca input nama dari pengguna

        System.out.print("Masukkan jenis kelamin: "); // Menampilkan teks untuk meminta jenis kelamin pengguna
        JenisKelamin = objInput.nextLine(); // Membaca input jenis kelamin dari pengguna

        System.out.print("Masukkan tahun lahir: "); // Menampilkan teks untuk meminta tahun lahir pengguna
        tahunLahir = objInput.nextInt(); // Membaca input tahun lahir dari pengguna
        System.out.println("Data diri: "); // Menampilkan teks "Data diri:"
        System.out.println("Nama: " + nama); // Menampilkan nama pengguna

        if (JenisKelamin.equals("l") || JenisKelamin.equals("L")){ // Memeriksa apakah input jenis kelamin adalah "l" atau "L"
            String jenisKelamin = "laki"; // Mendeklarasikan jenis kelamin sebagai "laki"
            System.out.println("Jenis Kelamin: " + jenisKelamin); // Menampilkan jenis kelamin
        } else if (JenisKelamin.equals("p") || JenisKelamin.equals("P")) { // Memeriksa apakah input jenis kelamin adalah "p" atau "P"
            String jenisKelamin = "perempuan"; // Mendeklarasikan jenis kelamin sebagai "perempuan"
            System.out.println("Jenis Kelamin: " + jenisKelamin); // Menampilkan jenis kelamin
        }
        int umur = timeNow.getYear() - tahunLahir; // Menghitung umur berdasarkan tahun saat ini dan tahun lahir
        System.out.println("umur " + umur); // Menampilkan umur pengguna
    }
}
