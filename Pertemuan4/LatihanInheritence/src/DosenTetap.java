/* Nama File    : DosenTetap.java
 * Deskripsi    : Kelas Dosen Tetap
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */


import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;
    private static int BUP = 65;

    public DosenTetap(){

    }
    public DosenTetap (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajipokok, String fakultas, String nidn ){
        super(nip, nama, tanggalLahir, tmt, gajipokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn(){
        return this.nidn;
    }

    public void setNidn(String nidn){
        this.nidn = nidn;
    }

    public double getTunjangan(){
        double tahun = this.getMasaKerja().getYears();
        return 0.02*tahun*getGajipokok();
    }

    public void printTglPensiun(){
        int tahunPensiun = getTanggalLahir().getYear()+BUP;
        System.out.println("1" + getTanggalLahir() + " "+ tahunPensiun);
    }

    public void printInfo(){
        System.out.println("NIP             : "+getNip());
        System.out.println("NIDN            : "+getNidn());
        System.out.println("Nama            : "+getNama());
        System.out.println("Tanggal Lahir   : "+getTanggalLahir());
        System.out.println("TMT             : "+getTmt());
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : "+getFakultas());
        System.out.println("Masa Kerja      : "+getMasaKerja().getYears()+" Tahun " + getMasaKerja().getMonths()+" Bulan");
        System.out.print("Tanggal Pensiun : ");
        printTglPensiun();
        System.out.println("Gaji Pokok      : "+getGajipokok());
        System.out.println("Tunjangan       : "+getTunjangan());

    }


}
