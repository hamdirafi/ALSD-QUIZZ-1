import java.util.ArrayList;

class Perpustakaan {
    ArrayList<Buku> daftarBuku = new ArrayList<>();
    ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public Buku cariBuku(String kodeBuku) {
        for (Buku buku : daftarBuku) {
            if (buku.kodeBuku.equals(kodeBuku)) {
                return buku;
            }
        }
        return null;
    }

    public Mahasiswa cariMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.nim.equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

    public void tampilkanPeminjaman() {
        System.out.println("\nDaftar Peminjaman Buku:");
        for (Mahasiswa m : daftarMahasiswa) {
            if (!m.bukuDipinjam.isEmpty()) {
                System.out.print(m.nama + " meminjam: ");
                for (Buku b : m.bukuDipinjam) {
                    System.out.print(b.judul);
                }
                System.out.println();
            }
        }
    }
}