/* Nama File    : Dosen.java
 * Deskripsi    : Kelas Dosen mewarisi kelas Pegawai
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */
import java.time.LocalDate;

public class Dosen extends Pegawai {
    /* ATRIBUT */
    private String fakultas;

    /* METHOD */

    // KONSTRUKTOR 
    public Dosen(){

    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajipokok, String fakultas){
        super(nip, nama, tanggalLahir, tmt, gajipokok);
        this.fakultas = fakultas;
    }

    // SELEKTOR
    public String getFakultas(){
        return this.fakultas;
    }

    // MUTATOR
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }


}
