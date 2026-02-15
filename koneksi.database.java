package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_peminjaman";
            String user = "root";
            String pass = "";
            koneksi = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return koneksi;
    }
}
