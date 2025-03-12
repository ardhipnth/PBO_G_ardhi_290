class Pahlawan extends KarakterGame {
    // Konstruktor untuk membuat objek Pahlawan
    public Pahlawan(String name, int kesehatan) {
        super(name, kesehatan); // Memanggil konstruktor kelas induk
    }

    // Override metode serang() dari kelas induk
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getName() + " menyerang " + target.getName() + " menggunakan Orbital Strike ");
        target.setKesehatan(target.getKesehatan() - 20); // Mengurangi kesehatan target
        System.out.println(" Kesehatan " + target.getName() + " sekarang " + target.getKesehatan());
    }
}