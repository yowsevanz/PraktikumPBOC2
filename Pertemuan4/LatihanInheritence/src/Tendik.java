/* Nama File    : Tendik.java
 * Deskripsi    : Kelas Tendik mewarisi kelas Pegawai
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

import java.time.LocalDate;

public class Tendik extends Pegawai{
    /* ATRIBUT */
    private String bidang;
    private static int BUP = 55;

    /* METHOD */

    // KONSTRUKTOR 
    public Tendik(){

    }
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajipokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajipokok);
        this.bidang = bidang;
    }

    // SELEKTOR
    public String getBidang(){
        return this.bidang;
    }

    // MUTATOR
    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    // METHOD LAINNYA
    public double getTunjangan(){
        double tahun = this.getMasaKerja().getYears();
        return 0.01*tahun*getGajipokok();
    }

    public LocalDate getTglPensiun(){
        LocalDate lahir = getTanggalLahir();
        LocalDate pensiun = lahir.plusMonths(1).withDayOfMonth(1).plusYears(BUP);
        return pensiun;
    }

    public void printInfo(){
        System.out.println("NIP             : "+getNip());
        System.out.println("Nama            : "+getNama());
        System.out.println("Tanggal Lahir   : "+getTanggalLahir().getDayOfMonth()+ " " + getTanggalLahir().getMonth() + " "+ getTanggalLahir().getYear());
        System.out.println("TMT             : "+getTmt().getDayOfMonth()+ " " + getTmt().getMonth() + " "+ getTmt().getYear());
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : "+getBidang());
        System.out.println("Masa Kerja      : "+getMasaKerja().getYears()+" Tahun " + getMasaKerja().getMonths()+" Bulan");
        System.out.println("Tanggal Pensiun : "+getTglPensiun().getDayOfMonth()+ " " + getTglPensiun().getMonth() + " "+ getTglPensiun().getYear());
        System.out.println("Gaji Pokok      : Rp"+getGajipokok());
        System.out.println("Tunjangan       : Rp"+getTunjangan());

    }

}
