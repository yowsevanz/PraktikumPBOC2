/* Nama File    : Manusia.java
 * Deskripsi    : Kelas abstrak yang merepresentasikan manusia dengan atribut identitas, pendapatan, serta menyediakan method untuk menghitung masa kerja
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 16 April 2026 */

import java.time.LocalDate;
public abstract class Manusia {
    /* ATRIBUT */
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns;

    /* METHOD */
    // KONSTRUKTOR
    public Manusia(){
        counterMns++;

    }

    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat,  double pendapatan){

        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;

    }

    // SELEKTOR
    public String getNama(){
        return nama;
    }

    public LocalDate getTglMulaiKerja(){
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    // MUTATOR  
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }


    // METHOD LAINNYA
    public static int getCounterMns(){
        return counterMns;
    }

    public void cetakInfo(){
        System.out.println("\nNama                : " + this.nama);
        System.out.println("Tanggal Mulai Kerja : " + this.tgl_mulai_kerja);
        System.out.println("Alamat              : " + this.alamat);
        System.out.println("Pendapatan          : " + this.pendapatan);

    }

    public abstract int hitungMasaKerja();




}
