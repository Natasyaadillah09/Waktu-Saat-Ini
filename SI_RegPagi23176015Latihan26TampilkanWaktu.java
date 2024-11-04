/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176015.latihan26.tampilkanwaktu;

/**
 *
 * @author Asus
 * NAMA     : Natasya Adillah
 * KELAS    : PBO 06
 * NIM      : 23176015
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menampilkan tanggal dan 
 * waktu saat ini
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class SI_RegPagi23176015Latihan26TampilkanWaktu {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime sekarang = LocalDateTime.now();

        // Define the date and time format
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));

        // Format the current date and time according to the pattern
        String waktuFormatted = sekarang.format(formatTanggal);

        System.out.println("Hari ini adalah hari : " + waktuFormatted);
    }
}

