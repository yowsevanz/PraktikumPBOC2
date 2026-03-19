/* Nama File    : Pegawai.java
 * Deskripsi    : Kelas Pegawai 
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajipokok;

    public Pegawai(){

    }
    public Pegawai( String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajipokok){
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajipokok = gajipokok;

    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public LocalDate getTanggalLahir(){
        return tanggalLahir;
    }
    
    public LocalDate getTmt(){
        return tmt;
    }

    public double getGajipokok(){
        return gajipokok;
    }


    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTanggallahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setTmt(LocalDate tmt){
        this.tmt = tmt;
    
    }

    public void setGajipokok(double gajipokok){
        this.gajipokok = gajipokok;
    }

    
    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    





}

