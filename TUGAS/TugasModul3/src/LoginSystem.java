import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        User user = new User("user", "0000");

        Admin admin = new Admin("namaAdmin", "NIMadmin", "UserAdmin", "passAdmin");
        admin.setNama("Muhammad Ardhi");
        admin.setNim("290");
        admin.setAdminuser("admin290");
        admin.setPassword("pass290");

        Mahasiswa mahasiswa = new Mahasiswa("nama", "290");
        mahasiswa.setNama("Muhammad Ardhi");
        mahasiswa.setNim("290");

        int pilihan = 0;

        while (pilihan != 3) {
            System.out.println("Pilih Login:");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Masukan pilihan: ");
            pilihan = objInput.nextInt();
            objInput.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Username:");
                    String adminUser = objInput.nextLine();
                    System.out.print("Masukan Password:");
                    String password = objInput.nextLine();
                    if (admin.login(adminUser, password)) {
                        admin.displayinfo();
                    }
                    break;

                case 2:
                    System.out.print("Masukan nama:");
                    String nama = objInput.nextLine();
                    System.out.print("Masukan nim:");
                    String nim = objInput.nextLine();
                    if (mahasiswa.login(nama, nim)) {
                        mahasiswa.displayinfo();
                    }
                    break;

                case 3:
                    System.out.println("Program berakhir.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
        objInput.close();
    }
}