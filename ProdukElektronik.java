class ProdukElektronik {
    private String nama;
    private double harga;
    private String merek;

    // Constructor
    public ProdukElektronik(String nama, double harga, String merek) {
        this.nama = nama;
        this.harga = harga;
        this.merek = merek;
    }

    // Getter untuk informasi produk
    public String getInfo() {
        return "Nama: " + nama + "\nHarga: " + harga + "\nMerek: " + merek;
    }
}
