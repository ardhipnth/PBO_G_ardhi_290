import java.util.Scanner;

public class Admin {
    String username = "admin290";
    String password = "password290";

    void login(String userInput, String passInput) {
        if ((userInput.equals(username)) && (passInput.equals(password))){
            System.out.println("Login admin berhasil");
        } else {
            System.out.println("login admin gagal, username atau nim salah");
        }
    }
}
