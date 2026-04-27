/* Nama File    : Burung.java
 * Deskripsi    : Kelas Burung merupakan turunan dari kelas Anabul dengan implementasi perilaku bergerak dan bersuara khusus untuk Burung
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */
public class Burung extends Anabul{
    public Burung(){
        super("");
    }

    public Burung(String Nama){
        super(Nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Burung " + getNama() + " terbang");
    }

    public void Bersuara(){
        System.out.println("Burung " + getNama() + " berbunyi cuit cuit");
    }

}
