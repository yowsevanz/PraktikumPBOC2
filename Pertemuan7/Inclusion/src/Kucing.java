/* Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing  merupakan turunan dari kelas Anabul dengan implementasi perilaku bergerak dan bersuara khusus untuk Kucing
 * Pembuat      : Yasmina Syahidah
 * Tanggal      : 23 April 2026 */

public class Kucing extends Anabul{
    public Kucing(){
        super("");
    }

    public Kucing(String Nama){
        super(Nama);
    }

    @Override
    public void Gerak(){
        System.out.println("Kucing " + getNama() + " melata");
    }

    public void Bersuara(){
        System.out.println("Kucing " + getNama() + " berbunyi meong");
    }
}