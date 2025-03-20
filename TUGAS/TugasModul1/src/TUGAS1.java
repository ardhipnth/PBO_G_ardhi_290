import java.util.Scanner;
public class TUGAS1 {
    public static void main(String[] args){
        int pilih;
        Scanner objInput = new Scanner(System.in);
        System.out.println("Pilih login");
        System.out.println("1.Admin");
        System.out.println("2.Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        pilih = objInput.nextInt();
        objInput.nextLine();

        if (pilih == 1 ){
            String usernameAdmin = "Admin290";
            String password = "Password290";
            String userAdminInput ;
            String passAdminInput;
            System.out.print("Masukkan username: ");
            userAdminInput = objInput.nextLine();
            System.out.print("Masukkan password: ");
            passAdminInput = objInput.nextLine();
            if (userAdminInput.equals(usernameAdmin) && passAdminInput.equals(password)){
                System.out.println("Login Admin Berhasil");
            } else {
                System.out.println("Login gagal! Username atau password salah");

            }

        }else if (pilih == 2){
        String namaMahasiswa = "muhammad Ardhi pontoh";
        String NimMahasiswa = "202410370110290";
        String namaMahasiswaInput;
        String NimMahasiswaInput;
            System.out.print("Masukkan nama: ");
            namaMahasiswaInput = objInput.nextLine();
            System.out.print("Masukkan NIM: ");
            NimMahasiswaInput = objInput.nextLine();

            if (namaMahasiswaInput.equals(namaMahasiswa) && NimMahasiswaInput.equals(NimMahasiswa)){
                System.out.println("Login mahasiswa berhasil.");
            } else {
                System.out.println("Login gagal! Nama atau Nim salah.");
            }

        }else {
                System.out.println("pilihan tidak valid");
            }


    }
}
