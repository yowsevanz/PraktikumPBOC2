/* Nama File    : Tendik.java
 * Deskripsi    : Kelas Tendik
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidang;

    public Tendik(){

    }
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajipokok, String bidang){
        super(nip, nama, tanggalLahir, tmt, gajipokok);
        this.bidang = bidang;
    }

    public String getBidang(){
        return this.bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

}
