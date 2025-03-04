import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        
        while (true) {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); 
            
            if (pilihan == 1) {
                System.out.print("Masukkan kode buku: ");
                String kode = input.nextLine();
                System.out.print("Masukkan judul buku: ");
                String judul = input.nextLine();
                System.out.print("Masukkan penulis: ");
                String penulis = input.nextLine();
                perpus.tambahBuku(new Buku(kode, judul, penulis));
                System.out.println("Buku berhasil ditambahkan!");
            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = input.nextLine();
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = input.nextLine();
                perpus.tambahMahasiswa(new Mahasiswa(nim, nama));
                System.out.println("Mahasiswa berhasil ditambahkan!");
            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = input.nextLine();
                System.out.print("Masukkan kode buku: ");
                String kode = input.nextLine();
                Mahasiswa mhs = perpus.cariMahasiswa(nim);
                Buku buku = perpus.cariBuku(kode);
                if (mhs != null && buku != null) {
                    if (mhs.pinjamBuku(buku)) {
                        System.out.println(mhs.nama + " berhasil meminjam " + buku.judul);
                    } else {
                        System.out.println("Gagal meminjam buku: " + buku.judul + " karena sudah dipinjam orang lain.");
                    }
                }
            } else if (pilihan == 4) {
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = input.nextLine();
                System.out.print("Masukkan kode buku: ");
                String kode = input.nextLine();
                Mahasiswa mhs = perpus.cariMahasiswa(nim);
                Buku buku = perpus.cariBuku(kode);
                if (mhs != null && buku != null) {
                    mhs.kembalikanBuku(buku);
                    System.out.println(mhs.nama + " berhasil mengembalikan " + buku.judul);
                }
            } else if (pilihan == 5) {
                perpus.tampilkanPeminjaman();
            } else if (pilihan == 6) {
                System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                break;
            }
        }
        input.close();
    }
}
