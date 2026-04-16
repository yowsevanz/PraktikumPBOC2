/* Nama File    : PNS.java
 * Deskripsi    : Kelas PNS yang mewarisi kelas Manusia dan mengimplementasikan Interface IPajak
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 16 April 2026 */
import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements IPajak {
    /* ATRIBUT */
    private String nip;
    private static int counterPNS;

    /* METHOD */

    // KONSTRUKTOR
    public PNS(){
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat,  double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // SELEKTOR
    public String getNip(){
        return nip;
    }

    // MUTATOR
    public void setNip(String nip){
        this.nip = nip;
    }

    // METHOD LAINNYA
    public static int getCounterPNS(){
        return counterPNS;
    }

    public int hitungMasaKerja(){
        Period masaKerja = Period.between(getTglMulaiKerja(), LocalDate.now());
        return masaKerja.getYears()+6;
    }
    public double hitungPajak(){
        return 0.1*this.getPendapatan();
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP                 : " + this.getNip());
        System.out.println("Pajak               : " + this.hitungPajak());
        System.out.println("Masa Kerja          : " + this.hitungMasaKerja());


    }


}
