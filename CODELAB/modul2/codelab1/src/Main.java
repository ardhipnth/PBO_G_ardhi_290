public class Main {
    public static void main (String[] args){
        hewan hewan1 = new hewan();
        hewan hewan2 = new hewan();

        hewan1.Nama = "Kucing";
        hewan2.Nama = "Anjing";

        hewan1.Jenis = "Mamalia";
        hewan2.Jenis = "Mamalia";

        hewan1.Suara = "nyann~~";
        hewan2.Suara = "Woof-Woof!!";

        System.out.println("hallo Mr Ardhii!");

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}

