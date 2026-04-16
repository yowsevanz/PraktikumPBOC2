/* Nama File    : Petani.java
 * Deskripsi    : Kelas Petani mewarisi kelas Manusia dan mengimplementasikan interface Pajak
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 16 April 2026 */
import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements IPajak {
    /* ATRIBUT */
    private String asal_kota;
    private static int counterPetani;

    /* METHOD */
    // KONSTRUKTOR
    public Petani(){
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat,  double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }


    // SELEKTOR 
    public String getAsal_kota(){
        return asal_kota;
    }

    // MUTATOR
    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }


    // METHOD LAINNYA
    public static int getCounterPetani(){
        return counterPetani;
    }

    public int hitungMasaKerja(){
        Period masaKerja = Period.between(getTglMulaiKerja(), LocalDate.now());
        return masaKerja.getYears()+1;
    }

    public double hitungPajak(){
        return 0;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota           : " + this.getAsal_kota());
        System.out.println("Pajak               : " + this.hitungPajak());
        System.out.println("Masa Kerja          : " + this.hitungMasaKerja());
    }
}
