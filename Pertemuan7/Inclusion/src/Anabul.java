/* Nama File    : Anabul.java
 * Deskripsi    : Kelas Anabul yang merepresentasikan hewan peliharaan dengan atribut nama serta perilaku dasar seperti bergerak dan bersuara
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */

public class Anabul {
    private String Nama;

    public Anabul() {
        this.Nama = "";
    }

    public Anabul(String Nama){
        this.Nama = Nama;
    }

    public String getNama(){
        return Nama;
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void Gerak(){
        System.out.println("Anabul " + Nama + " bergerak ....");

    }

    public void Bersuara(){
        System.out.println("Anabul " + Nama + " bersuara ....");

    }
}
