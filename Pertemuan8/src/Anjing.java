/* Nama File    : Anjing.java
 * Deskripsi    : Kelas Anjing  merupakan turunan dari kelas Anabul dengan implementasi perilaku bergerak dan bersuara khusus untuk anjing
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 30 April 2026 */

public class Anjing extends Anabul{
    /*METHOD */
    //Konstruktor
    public Anjing(){
        super("");
    }

    public Anjing(String Nama){
        super(Nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Anjing " + getNama() + " melata");
    }

    public void Bersuara(){
        System.out.println("Anjing " + getNama() + " gukguk");
    }
}
