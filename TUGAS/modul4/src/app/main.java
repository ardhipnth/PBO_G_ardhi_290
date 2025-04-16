package app;

import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;
import perpustakaan.Anggota;

public class main {
    public static void main(String[] args){
        Fiksi fiksi = new Fiksi("", "", "");
        NonFiksi nonFiksi = new NonFiksi("", "", "");
        Anggota anggota = new Anggota("", "", 0);

        fiksi.setJudul("habis gelap terbitlah terang");
        fiksi.setPenulis("RA Kartini");
        fiksi.setGenre("sejarah");
        fiksi.DisplayInfo();

        nonFiksi.setJudul("Action Power");
        nonFiksi.setPenulis("Irwan Wiseful Berutu");
        nonFiksi.setBidang("action");
        nonFiksi.DisplayInfo();

        System.out.println();

        anggota.setNama("muhammad ardhi");
        anggota.setIdAanggota("290");
        anggota.infoAnggota();
        anggota.setNama("gagah yudis");
        anggota.setIdAanggota("323");
        anggota.infoAnggota();

        System.out.println();

        anggota.setNama("muhammad ardhi");
        anggota.setIdAanggota("290");
        anggota.peminjaman(fiksi.getJudul());

        anggota.setDurasiPeminjaman(10);
        anggota.setNama("gagah yudis");
        anggota.setIdAanggota("323");
        anggota.peminjaman(nonFiksi.getJudul(), anggota.getDurasiPeminjaman());

        System.out.println();

        anggota.setNama("ardhi");
        anggota.pengembalian(fiksi.getJudul());
        anggota.setNama("yudis");
        anggota.pengembalian(nonFiksi.getJudul());
  }
}