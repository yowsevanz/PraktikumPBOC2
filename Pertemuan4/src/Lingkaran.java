/* Nama File    : Lingkaran.java
 * Deskripsi    : Kelas Lingkaran mewarisi kelas Bangun Datar
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){

    }

    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        super(1, warna, border);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi : "+ getJmlSisi());
        System.out.println("Warna       : "+getWarna());
        System.out.println("Border      : "+getBorder());

        // super.printInfo();
        System.out.println("jari        : "+ jari);
    }





}
