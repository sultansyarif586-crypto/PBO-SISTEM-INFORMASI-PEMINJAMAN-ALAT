package model;

public class Alat {
    private int idAlat;
    private String namaAlat;
    private String kategori;
    private int jumlah;
    private String kondisi;

    public Alat() {}

    public Alat(int idAlat, String namaAlat, String kategori, int jumlah, String kondisi) {
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.kondisi = kondisi;
    }

    public int getIdAlat() { return idAlat; }
    public void setIdAlat(int idAlat) { this.idAlat = idAlat; }

    public String getNamaAlat() { return namaAlat; }
    public void setNamaAlat(String namaAlat) { this.namaAlat = namaAlat; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }

    public String getKondisi() { return kondisi; }
    public void setKondisi(String kondisi) { this.kondisi = kondisi; }
}
