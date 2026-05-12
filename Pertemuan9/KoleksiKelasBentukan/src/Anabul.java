/* Nama File    : Anabul.java
 * Deskripsi    : Kelas Anabul yang merepresentasikan hewan peliharaan dengan atribut nama serta perilaku dasar seperti bergerak dan bersuara
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */

public class Anabul {
    /* ATRIBUT */
    private String Panggilan;

    /* METHOD */

    //Konstruktor
    public Anabul() {
        this.Panggilan = "";
    }

    public Anabul(String Panggilan){
        this.Panggilan = Panggilan;
    }

    //Selektor
    public String getNama(){
        return Panggilan;
    }

    //Mutator
    public void setNama(String Panggilan){
        this.Panggilan = Panggilan;
    }

    //Method lainnya
    public void Gerak(){
        System.out.println("Anabul " + Panggilan + " bergerak ");

    }

    public void Bersuara(){
        System.out.println("Anabul " + Panggilan + " bersuara ");

    }
}
