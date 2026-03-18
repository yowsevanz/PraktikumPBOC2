/* Nama File    : Lingkaran.java
 * Deskripsi    : Kelas Lingkaran mewarisi kelas Bangun Datar
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

public class Lingkaran extends BangunDatar{
    /* ATRIBUT */ 
    private double jari;

    /* METHOD */

    //Konstruktor
    public Lingkaran(){
        setJmlSisi(1);

    }

    public Lingkaran(double jari, String warna, String border){
        this.jari = jari;
        super(1, warna, border);
    }

    // Selektor
    public double getJari(){
        return jari;
    }

    // Mutator
    public void setJari(double jari){
        this.jari = jari;
    }

    // Method lainnya
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    // @Override Method
    // public void printInfo(){
    //     System.out.println("Jumlah Sisi : "+ getJmlSisi());
    //     System.out.println("Warna       : "+getWarna());
    //     System.out.println("Border      : "+getBorder());
    //     System.out.println("jari        : "+ jari);
    // }

    public void printInfo(){
        super.printInfo(); // keyword super
        System.out.println("jari        : "+ jari);
    }





}
