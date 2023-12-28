import java.util.ArrayList;
import java.util.Scanner;

// Kelas TokoElektronik mengimplementasikan interface Garansi
class TokoElektronik implements Garansi {
    ArrayList<ProdukElektronik> daftarProduk; // Menghilangkan modifier private

    // Constructor
    public TokoElektronik() {
        this.daftarProduk = new ArrayList<>();
    }

    // Menambahkan produk ke daftar
    public void tambahProduk(ProdukElektronik produk) {
        daftarProduk.add(produk);
    }

    // Implementasi dari interface Garansi
    @Override
    public void cekGaransi() {
        System.out.println("Daftar Produk Elektronik:");
        for (int i = 0; i < daftarProduk.size(); i++) {
            System.out.println((i + 1) + ". " + daftarProduk.get(i).getInfo());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih produk untuk cek garansi (nomor): ");
        int pilihan = scanner.nextInt();

        if (pilihan >= 1 && pilihan <= daftarProduk.size()) {
            System.out.println("Masa garansi untuk produk berjudul " + daftarProduk.get(pilihan - 1).getInfo() + " adalah 1 tahun.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
