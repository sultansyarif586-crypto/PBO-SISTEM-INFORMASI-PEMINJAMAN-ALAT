package model;

import java.util.Date;

public class Peminjaman {
    private int idPinjam;
    private Date tanggalPinjam;
    private Date tanggalKembali;
    private String status;
    private int idUser;
    private int idAlat;

    public Peminjaman() {}

    public Peminjaman(int idPinjam, Date tanggalPinjam, Date tanggalKembali, 
                      String status, int idUser, int idAlat) {
        this.idPinjam = idPinjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.status = status;
        this.idUser = idUser;
        this.idAlat = idAlat;
    }

    public int getIdPinjam() { return idPinjam; }
    public void setIdPinjam(int idPinjam) { this.idPinjam = idPinjam; }

    public Date getTanggalPinjam() { return tanggalPinjam; }
    public void setTanggalPinjam(Date tanggalPinjam) { this.tanggalPinjam = tanggalPinjam; }

    public Date getTanggalKembali() { return tanggalKembali; }
    public void setTanggalKembali(Date tanggalKembali) { this.tanggalKembali = tanggalKembali; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getIdUser() { return idUser; }
    public void setIdUser(int idUser) { this.idUser = idUser; }

    public int getIdAlat() { return idAlat; }
    public void setIdAlat(int idAlat) { this.idAlat = idAlat; }
}
