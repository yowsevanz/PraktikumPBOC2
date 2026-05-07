/* Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing  merupakan turunan dari kelas Anabul dengan implementasi perilaku bergerak dan bersuara khusus untuk Kucing
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */

public class Kucing extends Anabul{
    /* ATRIBUT */
    protected double bobot;

    /* METHOD */
    //Konstruktor
    public Kucing(){
        super("");
    }

    public Kucing(String Nama, double bobot){
        super(Nama);
        this.bobot = bobot;
    }

    //Selektor
    public double getBobot(){
        return bobot;
    }

    //Mutator
    public void setBobo(double bobot){
        this.bobot  = bobot;
    }

    // Method lainnya
    public void printBobot(){
        System.out.println(getBobot());
    }
    @Override
    public void Gerak(){
        System.out.println("Kucing " + getNama() + " melata");
    }

    public void Bersuara(){
        System.out.println("Kucing " + getNama() + " berbunyi meong");
    }
}