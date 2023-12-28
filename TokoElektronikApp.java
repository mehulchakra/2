import java.util.Scanner;

// Kelas TokoElektronikApp
public class TokoElektronikApp {
    public static void main(String[] args) {
        TokoElektronik toko = new TokoElektronik();

        // Menambahkan contoh produk
        toko.tambahProduk(new ProdukElektronik("Laptop", 800.0, "Lenovo"));
        toko.tambahProduk(new ProdukElektronik("Smartphone", 500.0, "Samsung"));
        toko.tambahProduk(new ProdukElektronik("Motor", 1000.0, "Lenovo"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Lihat Daftar Produk Elektronik");
            System.out.println("2. Cek Garansi Produk");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu (1-3): ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Daftar Produk Elektronik:");
                    for (int i = 0; i < toko.daftarProduk.size(); i++) {
                        System.out.println((i + 1) + ". " + toko.daftarProduk.get(i).getInfo());
                    }
                    break;

                case 2:
                    toko.cekGaransi();
                    break;

                case 3:
                    System.out.println("Terima kasih GAESSS! JALAN-JALAN KE KEDIRI,AKU PAMIT UNDUR DIRII.");
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-3.");
            }
        }
    }
}
