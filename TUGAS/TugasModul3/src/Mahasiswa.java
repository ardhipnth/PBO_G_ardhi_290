import java.util.Scanner;

public class Mahasiswa {
    String Nama;
    String Nim;

    public Mahasiswa (String username, String Password){
        this.Nama = Nama;
        this.Nim = Nim;
    }
    public boolean login(String username, String Password){
        return this.Nama.equals(username) && this.Nim.equals(Password);
    }
    public void displayInfo(){
        System.out.println(" Nama: " + this.Nama + " Nim " + this.Nim);
    }

}

