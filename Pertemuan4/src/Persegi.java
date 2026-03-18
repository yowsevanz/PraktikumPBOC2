/* Nama File    : Persegi.java
 * Deskripsi    : Kelas Persegi mewarisi kelas Bangun Datar
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

public class Persegi extends BangunDatar {
    private double Sisi;

    public Persegi(){
        setJmlSisi(4);
    
    }

    public Persegi(double Sisi, String warna, String border){
        this.Sisi = Sisi;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
        super(4, warna, border); // contoh penggunaan keyword super 

        // hanya dapat digunakan kalo atribut tidak menggunakan Access modifier private tapi protected
        this.jmlSisi = 4; 
        this.warna = warna;
        this.border = border;
        this.Sisi = Sisi;
    }

    public double getSisi(){
        return Sisi;
    }

    public void setSisi(double Sisi){
        this.Sisi = Sisi;
    }

    public double getLuas(){
        return Sisi*Sisi;
    }

    public double getKeliling(){
        return 4*Sisi;
    }

    public double getDiagonal(){
        return Sisi*Math.sqrt(2);
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi        : "+Sisi);
    }
}
