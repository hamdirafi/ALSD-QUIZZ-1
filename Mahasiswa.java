import java.util.ArrayList;

class Mahasiswa {
    String nim, nama;
    ArrayList<Buku> bukuDipinjam;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.bukuDipinjam = new ArrayList<>();
    }

    public boolean pinjamBuku(Buku buku) {
        if (bukuDipinjam.size() < 2 && !buku.dipinjam) {
            buku.dipinjam = true;
            bukuDipinjam.add(buku);
            return true;
        }
        return false;
    }

    public void kembalikanBuku(Buku buku) {
        if (bukuDipinjam.remove(buku)) {
            buku.dipinjam = false;
        }
    }
}