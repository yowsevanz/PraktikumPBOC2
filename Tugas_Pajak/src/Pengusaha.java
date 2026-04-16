/* Nama File    : Pengusaha.java
 * Deskripsi    : Kelas Pengusaha mewarisi kelas Manusia dan mengimplementasikan Interface Pajak
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 16 April 2026 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements IPajak{
    /* ATRIBUT */
    private String npwp;
    private static int counterPengusaha;

    /* METHOD */
    // KONSTRUKTOR
    public Pengusaha(){
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat,  double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // SELEKTOR
    public String getNpwp(){
        return npwp;
    }

    // MUTATOR
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    // METHOD LAINNYA
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public int hitungMasaKerja(){
        Period masaKerja = Period.between(getTglMulaiKerja(), LocalDate.now());
        return masaKerja.getYears()+1;
    }

    public double hitungPajak(){
        return 0.15*this.getPendapatan();
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP                : " + this.getNpwp());
        System.out.println("Pajak               : " + this.hitungPajak());
        System.out.println("Masa Kerja          : " + this.hitungMasaKerja());
    }
}
