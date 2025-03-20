import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin("admin", "admin290");
        Mahasiswa mahasiswa = new Mahasiswa("ardhi", "202410370110290");

        while (true) {
            System.out.println("Sistem login");
            System.out.println(" 1. Login Admin ");
            System.out.println(" 2. Login Mahasiswa ");
            System.out.println(" 3. Keluar ");

            System.out.println("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); //membuang newline
            switch (pilihan) {
                case 1:
                    System.out.print(" username: ");
                    String Username = scanner.nextLine();
                    System.out.print(" password: ");
                    String Password = scanner.nextLine();

                    if (admin.login(Username, Password)) {
                        System.out.println("Login Admin Berhasil!");
                    } else {
                        System.out.println("Login Admin Gagal!");
                    }
                    break;
                case 2 :
                    System.out.println("Nama: ");
                    String Nama = scanner.nextLine();
                    System.out.println("Nim: ");
                    String Nim = scanner.nextLine();
                    if (mahasiswa.login(Nama, Nim)){
                        System.out.println("Login Mahasiswa Berhasil!");
                        mahasiswa.displayInfo();
                    } else {
                        System.out.println("Login Mahasiswa Berhasil! ");
                    }
                    break;
                case 3 :
                    return; //
                default:
                    System.out.println("Pilihan tidak valid");
            }


        }
    }
}
