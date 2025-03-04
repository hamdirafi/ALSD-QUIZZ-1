class Buku {
    String kodeBuku, judul, penulis;
    boolean dipinjam;

    public Buku(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }
}