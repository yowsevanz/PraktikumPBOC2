/* Nama File    : Anabul.java
 * Deskripsi    : Kelas Anabul yang merepresentasikan hewan peliharaan dengan atribut nama serta perilaku dasar seperti bergerak dan bersuara
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */

public class Anabul {
    /* ATRIBUT */
    private String Nama;

    /* METHOD */

    //Konstruktor
    public Anabul() {
        this.Nama = "";
    }

    public Anabul(String Nama){
        this.Nama = Nama;
    }

    //Selektor
    public String getNama(){
        return Nama;
    }

    //Mutator
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //Method lainnya
    public void Gerak(){
        System.out.println("Anabul " + Nama + " bergerak ");

    }

    public void Bersuara(){
        System.out.println("Anabul " + Nama + " bersuara ");

    }
}
