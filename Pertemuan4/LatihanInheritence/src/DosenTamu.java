/* Nama File    : DosenTamu.java
 * Deskripsi    : Kelas Dosen Tamu mewarisi kelas Dosen
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

import java.time.LocalDate;


public class DosenTamu extends Dosen {
    /* ATRIBUT */
    private String nidk;
    private String tglAkhirKontrak;

    /* METHOD */

    // KONSTRUKTOR 
    public DosenTamu(){

    }
    public DosenTamu (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajipokok, String fakultas, String nidk, String tglAkhirKontrak ){
        super(nip, nama, tanggalLahir, tmt, gajipokok, fakultas);
        this.nidk = nidk;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    // SELEKTOR
    public String getNidk(){
        return this.nidk;
    }
    public String getTglAkhirKontrak(){
        return this.tglAkhirKontrak;
    }

    // MUTATOR
    public void setNidk(String nidk){
        this.nidk = nidk;
    }

    public void setTglAkhirKontrak(String tglAkhirKontrak){
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    // METHOD LAINNYA
    public double getTunjangan(){
        return 0.025*getGajipokok();
    }

    
    public void printInfo(){
        System.out.println("NIP                     : "+getNip());
        System.out.println("nidk                    : "+getNidk());
        System.out.println("Nama                    : "+getNama());
        System.out.println("Tanggal Lahir           : "+getTanggalLahir().getDayOfMonth()+ " " + getTanggalLahir().getMonth() + " "+ getTanggalLahir().getYear());
        System.out.println("TMT                     : "+getTmt().getDayOfMonth()+ " " + getTmt().getMonth() + " "+ getTmt().getYear());
        System.out.println("Jabatan                 : Dosen Tamu");
        System.out.println("Fakultas                : "+getFakultas());
        System.out.println("Masa Kerja              : "+getMasaKerja().getYears()+" Tahun " + getMasaKerja().getMonths()+" Bulan");
        System.out.println("Tanggal Akhir Kontrak   : "+getTglAkhirKontrak());
        System.out.println("Tunjangan               : Rp"+getTunjangan());

    }
    
}
