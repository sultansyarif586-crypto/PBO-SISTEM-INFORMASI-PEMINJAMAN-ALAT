package model;

import java.util.Date;

public class Pengembalian {
    private int idKembali;
    private Date tanggalDikembalikan;
    private double denda;
    private int idPinjam;

    public Pengembalian() {}

    public Pengembalian(int idKembali, Date tanggalDikembalikan, 
                        double denda, int idPinjam) {
        this.idKembali = idKembali;
        this.tanggalDikembalikan = tanggalDikembalikan;
        this.denda = denda;
        this.idPinjam = idPinjam;
    }

    public int getIdKembali() { return idKembali; }
    public void setIdKembali(int idKembali) { this.idKembali = idKembali; }

    public Date getTanggalDikembalikan() { return tanggalDikembalikan; }
    public void setTanggalDikembalikan(Date tanggalDikembalikan) { 
        this.tanggalDikembalikan = tanggalDikembalikan; 
    }

    public double getDenda() { return denda; }
    public void setDenda(double denda) { this.denda = denda; }

    public int getIdPinjam() { return idPinjam; }
    public void setIdPinjam(int idPinjam) { this.idPinjam = idPinjam; }
}
