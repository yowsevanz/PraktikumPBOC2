/* Nama File    : DosenTetap.java
 * Deskripsi    : Kelas Dosen Tetap mewarisi kelas Dosen
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */


import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /* ATRIBUT */
    private String nidn;
    private static int BUP = 65;

    /* METHOD */

    // KONSTRUKTOR 
    public DosenTetap(){

    }
    public DosenTetap (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajipokok, String fakultas, String nidn ){
        super(nip, nama, tanggalLahir, tmt, gajipokok, fakultas);
        this.nidn = nidn;
    }

    //SELEKTOR
    public String getNidn(){
        return this.nidn;
    }

    //MUTATOR
    public void setNidn(String nidn){
        this.nidn = nidn;
    }

    //METHOD LAINNYA
    public double getTunjangan(){
        double tahun = this.getMasaKerja().getYears();
        return 0.02*tahun*getGajipokok();
    }

    public LocalDate getTglPensiun(){
        LocalDate lahir = getTanggalLahir();
        LocalDate pensiun = lahir.plusMonths(1).withDayOfMonth(1).plusYears(BUP);
        return pensiun;
    }

    public void printInfo(){
        System.out.println("NIP             : "+getNip());
        System.out.println("NIDN            : "+getNidn());
        System.out.println("Nama            : "+getNama());
        System.out.println("Tanggal Lahir   : "+getTanggalLahir().getDayOfMonth()+ " " + getTanggalLahir().getMonth() + " "+ getTanggalLahir().getYear());
        System.out.println("TMT             : "+getTmt().getDayOfMonth()+ " " + getTmt().getMonth() + " "+ getTmt().getYear());
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : "+getFakultas());
        System.out.println("Masa Kerja      : "+getMasaKerja().getYears()+" Tahun " + getMasaKerja().getMonths()+" Bulan");
        System.out.println("Tanggal Pensiun : "+getTglPensiun().getDayOfMonth()+ " " + getTglPensiun().getMonth() + " "+ getTglPensiun().getYear());
        System.out.println("Gaji Pokok      : Rp"+getGajipokok());
        System.out.println("Tunjangan       : Rp"+getTunjangan());

    }


}
