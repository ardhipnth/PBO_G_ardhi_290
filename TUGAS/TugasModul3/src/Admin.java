import java.util.Scanner;

public class Admin {
    String Username;
    String Password;

    public Admin(String username, String password){
        this.Username = username;
        this.Password = password;
    }
    public boolean login(String username, String Password){
        return this.Username.equals(username) && this.Password.equals(Password);
    }
}
