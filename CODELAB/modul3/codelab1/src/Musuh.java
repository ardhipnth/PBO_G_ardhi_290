class Musuh extends KarakterGame {
    // Konstruktor untuk membuat objek Musuh
    public Musuh(String name, int kesehatan) {
        super(name, kesehatan); // Memanggil konstruktor kelas induk
    }

    // Override metode serang() dari kelas induk
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getName() + " menyerang " + target.getName() + " menggunakan Snake Bite ");
        target.setKesehatan(target.getKesehatan() - 15); // Mengurangi kesehatan target
        System.out.println(" Kesehatan " + target.getName() + " sekarang " + target.getKesehatan());
    }
}