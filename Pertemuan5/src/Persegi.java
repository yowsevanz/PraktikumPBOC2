/* Nama File    : Persegi.java
 * Deskripsi    : Kelas Persegi mewarisi kelas Bangun Datar
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 12 Maret 2026 */

public class Persegi extends BangunDatar implements IResize {
    /* ATRIBUT */
    private double Sisi;

    /* METHOD */

    // Konstruktor
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
        // this.jmlSisi = 4; 
        // this.warna = warna;
        // this.border = border;
        // this.Sisi = Sisi;
    }

    // Selektor 
    public double getSisi(){
        return Sisi;
    }

    // Mutator
    public void setSisi(double Sisi){
        this.Sisi = Sisi;
    }

    // Method lainnya
    public double getLuas(){
        return Sisi*Sisi;
    }

    public double getKeliling(){
        return 4*Sisi;
    }

    public double getDiagonal(){
        return Sisi*Math.sqrt(2);
    }

    // @Override method
    public void printInfo(){
        System.out.println("Jumlah Sisi : "+ getJmlSisi());
        System.out.println("Warna       : "+getWarna());
        System.out.println("Border      : "+getBorder());

        // super.printInfo();
        System.out.println("Sisi        : "+ Sisi);
    }
    
    // Keyword Super
    // public void printInfo(){
    //     super.printInfo();
    //     System.out.println("Sisi        : "+Sisi);
    // }

    public void zoomIn(){
        Sisi = Sisi * 1.1;

    }

    public void zoomOut(){
        Sisi = Sisi * 0.9;

    }

    public void zoom(int percent){
        Sisi = Sisi * percent/100;

    }

}
