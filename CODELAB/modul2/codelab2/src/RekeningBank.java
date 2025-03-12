public class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    void tampilkanInfo() {
        System.out.println("informasi rekening");
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
    }
    void setorUang ( double jumlah){
        saldo += jumlah;
        System.out.println("Setor tunai sebesar Rp " + jumlah + " Setor tunai berhasil.");
        System.out.println("Saldo baru: Rp " + saldo);

    }
    void tarikUang ( double jumlah){
        if (saldo >= jumlah){
            saldo -= jumlah;
            System.out.println("Tarik tunai sebesar Rp " + jumlah + " Tarik tunai berhasil.");
            System.out.println("Saldo baru: Rp " + saldo);
        } else {
            System.out.println("Tarik tunai Gagal,saldo tidak mencukupi");
        }
    }

}

