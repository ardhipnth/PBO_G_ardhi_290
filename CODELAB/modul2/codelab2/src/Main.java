
public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank();

        rekening1.nomorRekening = "202410370110290";
        rekening1.namaPemilik = "Muhammad Ardhi Pontoh";
        rekening1.saldo = 200000;

        System.out.println("Muhammad Ardhi Pontoh");
        rekening1.setorUang(100000);
        System.out.println("Muhammad Ardhi Pontoh");
        rekening1.tarikUang(400000);

        System.out.println("Informasi Rekening 1:");
        rekening1.tampilkanInfo();

        System.out.println("\n------------------\n");

        RekeningBank rekening2 = new RekeningBank();

        rekening2.nomorRekening = "202410370110324";
        rekening2.namaPemilik = "Alinno Faza";
        rekening2.saldo = 100000;

        System.out.println("Alinno Faza");
        rekening2.setorUang(400000);
        System.out.println("Alinno Faza");
        rekening2.tarikUang(100000);

        System.out.println("Informasi Rekening 2:");
        rekening2.tampilkanInfo();

    }
}