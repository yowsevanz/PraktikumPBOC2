/* Nama File    : Dosen.java
 * Deskripsi    : Kelas Dosen 
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */
import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(){

    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajipokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajipokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return this.fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }


}
